package com.checkers;

class Application {
    private static final String QUIT = "QUIT";

    public static void main(String[] args) {
        Board board = new Board();
//        System.out.println("Printing empty board");
//        System.out.println(board);

//        System.out.println("Adding some figures....");
        board.setFigure(1,1,new Pawn("b"));
        board.setFigure(3,4,new Pawn("b"));
        board.setFigure(0,5,new Pawn("w"));
        board.setFigure(2,1,new Pawn("w"));
        board.setFigure(1,2,new Queen("b"));
        board.setFigure(5,5,new Queen("b"));
        board.setFigure(6,7,new Queen("w"));
        board.setFigure(2,7,new Queen("w"));

//        System.out.println("Printing new board");
        while(true){
            System.out.println(board);
            String userMove = UserDialogs.getNextMove();
            if (userMove.equals(QUIT)) {
                return;
            }
            UserMove theMove = UserDialogs.translateToMove(userMove);
            board.move(theMove);
        }

//        System.out.println("Moving B2 to C3");
//        board.move(1,1,2,2);
//        System.out.println(board);
//
//        System.out.println("Moving C3 to B3");
//        board.move(2,2,1,2);
//        System.out.println(board);
//
//        System.out.println("Printing field B2");
//        Figure figure;
//        figure = board.getFigure(1,1);
//        System.out.println(figure);
    }
}

