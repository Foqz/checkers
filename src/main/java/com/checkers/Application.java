package com.checkers;

class Application {
    public static void main(String[] args) {
        None none = new None("");
        Pawn pawnW = new Pawn("wQ");
        Queen queenW = new Queen("wP");
        Pawn pawnB = new Pawn("bP");
        Queen queenB = new Queen("bQ");

        Board board = new Board();
        board.rowAdder();
        for(int n = 0; n<8; n++) {
            System.out.println(board.rows.get(n).columns);
        }
        board.setFigure(1,1,pawnB);
        System.out.println("printing new board");
        for(int n = 0; n<8; n++) {
            System.out.println(board.rows.get(n).columns);
        }
    }
}

