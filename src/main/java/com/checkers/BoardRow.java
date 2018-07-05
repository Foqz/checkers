package com.checkers;

import java.util.ArrayList;

public class BoardRow {
    ArrayList<Figure> columns = new ArrayList<>();
    public BoardRow() {
        for(int n= 0; n<8; n++) {
            columns.add(new None(""));
        }
    }
    public void figureChanger(int col, Figure figure) {
        columns.add(col,figure);
        columns.remove(col+1);
    }
    public Figure getColumns(int col) {
        Figure figure = null;
        if (col == 0) {
            figure = columns.get(0);
        } else if (col == 1) {
            figure = columns.get(1);
        } else if (col == 2) {
            figure = columns.get(2);
        } else if (col == 3) {
            figure = columns.get(3);
        } else if (col == 4) {
            figure = columns.get(4);
        } else if (col == 5) {
            figure = columns.get(5);
        } else if (col == 6) {
            figure = columns.get(6);
        } else if (col == 7) {
            figure = columns.get(7);
        }
        return figure;
    }
}
