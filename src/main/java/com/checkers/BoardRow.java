package com.checkers;

import java.util.ArrayList;

public class BoardRow {
    ArrayList<Figure> columns = new ArrayList<>();
    public BoardRow() {
        for(int n= 0; n<8; n++) {
            columns.add(new None(""));
        }
    }
    public void setFigure(int col, Figure figure) {
        columns.add(col,figure);
        columns.remove(col+1);
    }
    public Figure getFigure(int col) {
        return columns.get(col);
    }
}
