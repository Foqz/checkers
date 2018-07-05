package com.checkers;

import java.util.ArrayList;

public class BoardRow {
    private Figure field1;
    private Figure field2;
    private Figure field3;
    private Figure field4;
    private Figure field5;
    private Figure field6;
    private Figure field7;
    private Figure field8;

    public BoardRow(Figure field1, Figure field2, Figure field3, Figure field4, Figure field5, Figure field6, Figure field7, Figure field8) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
        this.field6 = field6;
        this.field7 = field7;
        this.field8 = field8;
    }

    public Figure getField(int col) {
        Figure field = null;
        if (col == 0){
            field = field1;
        } else if (col == 1){
            field = field2;
        } else if(col == 2){
            field = field3;
        } else if (col == 3){
            field = field4;
        } else if (col == 4){
            field = field5;
        } else if (col == 5){
            field = field6;
        }else if(col == 6){
            field = field7;
        } else if(col == 7){
            field = field8;
        }
        return field;
    }
    public Figure setField(Figure figure){
        return figure;
    }
}
