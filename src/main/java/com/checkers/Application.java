package com.checkers;

class Application {
    public static void main(String[] args) {
        Board board = new Board();
        board.rowAdder();
        System.out.println("Printting empty board");
        System.out.println("-----------------------------------------");
        for(int n = 0; n<8; n++) {
            System.out.println("|" + board.getFigure(n,0) +"|"
                    + board.getFigure(n,1) +"|"
                    + board.getFigure(n,2) +"|"
                    + board.getFigure(n,3) +"|"
                    + board.getFigure(n,4) +"|"
                    + board.getFigure(n,5) +"|"
                    + board.getFigure(n,6) +"|"
                    + board.getFigure(n,7) +"|");
            System.out.println("-----------------------------------------");
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
        System.out.println("-----------------------------------------");
        for(int n = 0; n<8; n++) {
            System.out.println("|" + board.getFigure(n,0) +"|"
                    + board.getFigure(n,1) +"|"
                    + board.getFigure(n,2) +"|"
                    + board.getFigure(n,3) +"|"
                    + board.getFigure(n,4) +"|"
                    + board.getFigure(n,5) +"|"
                    + board.getFigure(n,6) +"|"
                    + board.getFigure(n,7) +"|");
            System.out.println("-----------------------------------------");
        }
        System.out.println("Printing field B2");
        Figure figure;
        figure = board.getFigure(1,1);
        System.out.println(figure);
    }
}

