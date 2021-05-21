package Praktikum;

import java.util.ArrayList;

public class TableColumn {
    public static final int TEXT_ALIGNMENT_LEFT = 0;
    public static final int TEXT_ALIGNMENT_RIGHT = 1;

    private String value;
    public TableColumn(String value, int TextAlignment, int RowSpan){
        this.value = value;
        this.TEXT_ALIGNMENT = TextAlignment;
        this.rowSpan = RowSpan;
    }
    public TableColumn(String value, int TextAlignment){
        this.value = value;
        this.TEXT_ALIGNMENT = TextAlignment;
    }
    public TableColumn(String value){
        this.value = value;
    }

    public TableColumn(int value, int TextAlignment, int RowSpan){
        this.value = String.valueOf(value);
        this.TEXT_ALIGNMENT = TextAlignment;
        this.rowSpan = RowSpan;
    }
    public TableColumn(int value, int TextAlignment){
        this.value = String.valueOf(value);
        this.TEXT_ALIGNMENT = TextAlignment;
    }
    public TableColumn(int value){
        this.value = String.valueOf(value);
    }
    public TableColumn(double value, int TextAlignment, int RowSpan){
        this.value = String.valueOf(value);
        this.TEXT_ALIGNMENT = TextAlignment;
        this.rowSpan = RowSpan;
    }
    public TableColumn(double value, int TextAlignment){
        this.value = String.valueOf(value);
        this.TEXT_ALIGNMENT = TextAlignment;
    }
    public TableColumn(double value){
        this.value = String.valueOf(value);
    }

    public int rowSpan = 0;
    public int TEXT_ALIGNMENT = TEXT_ALIGNMENT_LEFT;

    public String toString(){
        return value;
    }
}
