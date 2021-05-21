package Praktikum;

import java.util.ArrayList;

public class TableRow {
    public ArrayList<TableColumn> Column = new ArrayList<>();

    public TableRow(){
    }

    public TableRow(String... value){
        for (String val : value){
            Column.add(new TableColumn(val));
        }
    }

    public TableRow(TableColumn... value){
        for (TableColumn val : value){
            Column.add(val);
        }
    }

    public TableRow(int... value){
        for (int val : value){
            Column.add(new TableColumn(val));
        }
    }

    public TableRow(double... value){
        for (double val : value){
            Column.add(new TableColumn(val));
        }
    }

    public void addColumn(String... value){
        for (String val : value){
            Column.add(new TableColumn(val));
        }
    }

    public void addColumn(int... value){
        for (int val : value){
            Column.add(new TableColumn(val));
        }
    }

    public void addColumn(double... value){
        for (double val : value){
            Column.add(new TableColumn(val));
        }
    }

    public void addColumn(TableColumn... value){
        for (TableColumn val : value){
            Column.add(val);
        }
    }
}
