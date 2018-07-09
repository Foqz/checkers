package com.checkers;

        import java.util.ArrayList;


public class Board {
    private ArrayList<BoardRow> rows = new ArrayList<>();
    public Board() {
        for(int n = 0; n<8; n++) {
            rows.add(new BoardRow());
        }
    }
    public Figure getFigure(int row, int col) {
        return rows.get(row).getFigure(col);
    }
    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).setFigure(col,figure);
    }
    public boolean move(UserMove userMove){
        int row1 = userMove.getRow1();
        int col1 = userMove.getCol1();
        int row2 = userMove.getRow2();
        int col2 = userMove.getCol2();

        None none = new None("");
        if (row1 < 0 || row1 > 7 || col1 < 0 || col1 > 7 || row2 < 0 || row2 > 7 || col2 < 0 || col2 > 7) { //sprawdza czy poprawnie wpisano wartości pól
            return false; // ok
        } else if (getFigure(row1,col1).equals(none)) { // sprawdza czy w ogóle bierzemy jakiś pionek
            return false;
//        } else if (!(getFigure(row2,col2).equals(none)) ) { //sprawdza czy nastepne pole jest puste <- tu jest coś nie tak
//            return false;
//        }else if () { // poprawność "skoku"

        } else { //ok (dodaj jeszcze przesuwanie przy końcu)
            Figure temp;
            temp = getFigure(row1,col1);
            setFigure(row1, col1, new None(""));
            setFigure(row2, col2, temp);
            return true;
        }
    }
    @Override
    public String toString() {
        String s = "-----------------------------------------\n";
        for(int n = 0; n<8; n++) {
            for (int i = 0; i<8; i++) {
                if(i == 0) {
                    s += "|" + getFigure(n, i) + "|";
                } else {
                    s += getFigure(n,i) + "|";
                }
            }
            s += "\n-----------------------------------------\n";
        }
        return s;
    }
}
