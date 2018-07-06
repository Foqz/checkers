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
        System.out.println("Printting empty board");
        for(int n = 0; n<8; n++) {
            System.out.println(board.rows.get(n).columns);
        }
        System.out.println("Adding some figures....");
        board.setFigure(1,1,new Pawn("b"));
        board.setFigure(3,4,new Pawn("b"));
        board.setFigure(0,5,new Pawn("w"));
        board.setFigure(2,1,new Pawn("w"));
        board.setFigure(1,2,new Queen("b"));
        board.setFigure(5,5,new Queen("b"));
        board.setFigure(6,7,new Queen("w"));
        board.setFigure(2,7,new Queen("w"));
        System.out.println("Printing new board");
        for(int n = 0; n<8; n++) {
            System.out.println(board.rows.get(n).columns);
        }
        System.out.println("Printing field B2");
        Figure figure;
        figure = board.getFigure(1,1);
        System.out.println(figure);
    }
}

