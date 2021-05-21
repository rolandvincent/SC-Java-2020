package Praktikum;

import java.util.ArrayList;

public class Table {
    public static final int VERTICAL_LINE_VISIBLE_SHOW = 0;
    public static final int VERTICAL_LINE_VISIBLE_HIDDEN = 1;

    public ArrayList<TableRow> Header = new ArrayList<>();
    public ArrayList<TableRow> Row = new ArrayList<>();
    private ArrayList<Integer> ColumnWidth = new ArrayList<>();

    public void addHeaderRow(String... value){
        Header.add(new TableRow(value));
    }

    public void addHeaderRow(TableRow value){
        Header.add(value);
    }

    public void addRow(TableRow value){
        Row.add(value);
    }

    public int margin = 1;
    public char tVerticalLine = '|';
    public char tHorizontalLine = '-';
    public char tCorner = '+';
    public int VERTICAL_LINE_VISIBLE = VERTICAL_LINE_VISIBLE_SHOW;

    private void updateWidth(){
        int CurrentColIndex = 0;
        for (int r = 0; r < Header.size(); r++){
            for(int i = 0; i < Header.get(r).Column.size(); i++){
                while (ColumnWidth.size() < CurrentColIndex + 1)
                    ColumnWidth.add(0);

                if (Header.get(r).Column.get(i).rowSpan>0) {
                    int width = 0;
                    int _CurrentColIndex = CurrentColIndex;
                    for (int n = CurrentColIndex; n <= _CurrentColIndex + Header.get(r).Column.get(i).rowSpan; n++){
                        while (ColumnWidth.size() < n + 1)
                            ColumnWidth.add(0);
                        width += ColumnWidth.get(n);
                        CurrentColIndex = n;
                    }
                    if (width < Header.get(r).Column.get(i).toString().length() - margin * Header.get(r).Column.get(i).rowSpan * 2 - Header.get(r).Column.get(i).rowSpan){
                        ColumnWidth.set(CurrentColIndex, ColumnWidth.get(CurrentColIndex) + (Header.get(r).Column.get(i).toString().length()- margin * Header.get(r).Column.get(i).rowSpan * 2 - Header.get(r).Column.get(i).rowSpan) - (width));
                    }
                }else{
                    if (ColumnWidth.get(CurrentColIndex) < Header.get(r).Column.get(i).toString().length())
                        ColumnWidth.set(CurrentColIndex, Header.get(r).Column.get(i).toString().length());
                }
                CurrentColIndex ++;
            }
            CurrentColIndex = 0;
        }
        for (int r = 0; r < Row.size(); r++){
            for(int i = 0; i < Row.get(r).Column.size(); i++){
                while (ColumnWidth.size() < CurrentColIndex + 1)
                    ColumnWidth.add(0);

                if (Row.get(r).Column.get(i).rowSpan>0) {
                    int width = 0;
                    int _CurrentColIndex = CurrentColIndex;
                    for (int n = CurrentColIndex; n <= _CurrentColIndex + Row.get(r).Column.get(i).rowSpan; n++){
                        while (ColumnWidth.size() < n + 1)
                            ColumnWidth.add(0);
                        width += ColumnWidth.get(n);
                        CurrentColIndex = n;
                    }
                    if (width < Row.get(r).Column.get(i).toString().length() - margin * Row.get(r).Column.get(i).rowSpan * 2 - Row.get(r).Column.get(i).rowSpan){
                        ColumnWidth.set(CurrentColIndex, ColumnWidth.get(CurrentColIndex) + (Row.get(r).Column.get(i).toString().length()- margin * Row.get(r).Column.get(i).rowSpan * 2 - Row.get(r).Column.get(i).rowSpan) - (width));
                    }
                }else{
                    if (ColumnWidth.get(CurrentColIndex) < Row.get(r).Column.get(i).toString().length())
                        ColumnWidth.set(CurrentColIndex, Row.get(r).Column.get(i).toString().length());
                }
                CurrentColIndex ++;
            }
            CurrentColIndex = 0;
        }
    }

    private String SR(String val, int length){
        if (length == 0) length = 1;
        return String.format("%" + length + "s",val);
    }

    private String SL(String val, int length){
        if (length == 0) length = 1;
        return String.format("%-" + length + "s",val);
    }

    public String getTable(){
        updateWidth();
        String VericalLine = "" + tVerticalLine;
        if (VERTICAL_LINE_VISIBLE == VERTICAL_LINE_VISIBLE_HIDDEN)
            VericalLine = " ";

        for (int i = 0; i < ColumnWidth.size(); i++){
            System.out.print(tCorner);
            for(int x = 0; x < ColumnWidth.get(i) + margin * 2; x++)
                System.out.print(tHorizontalLine);
        }
        System.out.println(tCorner);
        int CurrentColIndex = 0;
        for (int r = 0; r < Header.size(); r++){
            if (Header.get(r).getClass() == TableLine.class){
                for (int i = 0; i < ColumnWidth.size(); i++){
                    System.out.print(tCorner);
                    for(int x = 0; x < ColumnWidth.get(i) + margin * 2; x++)
                        System.out.print(tHorizontalLine);
                }
                System.out.println(tCorner);
            }else{
                for (int i = 0; i < Header.get(r).Column.size(); i++){
                    System.out.print(VericalLine);
                    if (Header.get(r).Column.get(i).TEXT_ALIGNMENT == TableColumn.TEXT_ALIGNMENT_LEFT){
                        int totalWidth = 0;
                        int _CurrentColIndex = CurrentColIndex;
                        for(int h = CurrentColIndex; h <= _CurrentColIndex + Header.get(r).Column.get(i).rowSpan; h++){
                            totalWidth += ColumnWidth.get(h);
                            CurrentColIndex = h;
                        }
                        System.out.print(SL("",margin) + SL(Header.get(r).Column.get(i).toString(),totalWidth + margin * Header.get(r).Column.get(i).rowSpan * 2 + Header.get(r).Column.get(i).rowSpan) + SL("",margin));
                    }else{
                        int totalWidth = 0;
                        int _CurrentColIndex = CurrentColIndex;
                        for(int h = CurrentColIndex; h <= _CurrentColIndex + Header.get(r).Column.get(i).rowSpan; h++){
                            totalWidth += ColumnWidth.get(h);
                            CurrentColIndex = h;
                        }
                        System.out.print(SL("",margin) + SR(Header.get(r).Column.get(i).toString(),totalWidth + margin * Header.get(r).Column.get(i).rowSpan * 2 + Header.get(r).Column.get(i).rowSpan) + SL("",margin));
                    }
                    CurrentColIndex++;
                }
                System.out.println(VericalLine);
            }
            CurrentColIndex = 0;
        }
        for (int i = 0; i < ColumnWidth.size(); i++){
            System.out.print(tCorner);
            for(int x = 0; x < ColumnWidth.get(i) + margin * 2; x++)
                System.out.print(tHorizontalLine);
        }
        System.out.println(tCorner);
        for (int r = 0; r < Row.size(); r++){
            if (Row.get(r).getClass() == TableLine.class){
                for (int i = 0; i < ColumnWidth.size(); i++){
                    System.out.print(tCorner);
                    for(int x = 0; x < ColumnWidth.get(i) + margin * 2; x++)
                        System.out.print(tHorizontalLine);
                }
                System.out.println(tCorner);
            }else{
                for (int i = 0; i < Row.get(r).Column.size(); i++){
                    System.out.print(VericalLine);
                    if (Row.get(r).Column.get(i).TEXT_ALIGNMENT == TableColumn.TEXT_ALIGNMENT_LEFT){
                        int totalWidth = 0;
                        int _CurrentColIndex = CurrentColIndex;
                        for(int h = CurrentColIndex; h <= _CurrentColIndex + Row.get(r).Column.get(i).rowSpan; h++){
                            totalWidth += ColumnWidth.get(h);
                            CurrentColIndex = h;
                        }
                        System.out.print(SL("",margin) + SL(Row.get(r).Column.get(i).toString(),totalWidth + margin * Row.get(r).Column.get(i).rowSpan * 2 + Row.get(r).Column.get(i).rowSpan) + SL("",margin));
                    }else{
                        int totalWidth = 0;
                        int _CurrentColIndex = CurrentColIndex;
                        for(int h = CurrentColIndex; h <= _CurrentColIndex + Row.get(r).Column.get(i).rowSpan; h++){
                            totalWidth += ColumnWidth.get(h);
                            CurrentColIndex = h;
                        }
                        System.out.print(SL("",margin) + SR(Row.get(r).Column.get(i).toString(),totalWidth + margin * Row.get(r).Column.get(i).rowSpan * 2 + Row.get(r).Column.get(i).rowSpan) + SL("",margin));
                    }
                    CurrentColIndex++;
                }
                System.out.println(VericalLine);
            }
            CurrentColIndex = 0;
        }
        for (int i = 0; i < ColumnWidth.size(); i++){
            System.out.print(tCorner);
            for(int x = 0; x < ColumnWidth.get(i) + margin * 2; x++)
                System.out.print(tHorizontalLine);
        }
        System.out.println(tCorner);
        return "";
    }
}
