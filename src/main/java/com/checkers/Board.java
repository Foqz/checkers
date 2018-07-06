package com.checkers;

import java.util.ArrayList;


public class Board {

    ArrayList<BoardRow> rows = new ArrayList<>();
    public void rowAdder() {
        for(int n = 0; n<8; n++) {
            rows.add(new BoardRow());
        }
    }
    public Figure getFigure(int row, int col) {
        return rows.get(row).getColumns(col);
    }
    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).figureChanger(col,figure);
    }

//    @Override
//    public String toString(){
//        return null;
//    }
}
