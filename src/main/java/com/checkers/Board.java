package com.checkers;

import java.util.ArrayList;


public class Board {
    None none = new None("");
    Pawn pawnW = new Pawn("wQ");
    Queen queenW = new Queen("wP");
    Pawn pawnB = new Pawn("bP");
    Queen queenB = new Queen("bQ");

    ArrayList<BoardRow> rows = new ArrayList<>();
    public void rowAdder() {
        for(int n = 0; n<8; n++) {
            rows.add(new BoardRow(none, none, none, none, none, none, none, none));
        }
    }
    public Figure getFigure(int row, int col) {
        return rows.get(row).getField(col);
    }
    public void setFigure(int row, int col, Figure figure) {
        BoardRow boardRow = null;
        rows.set(row, rows.get(row).getField(col) );
    }

}
