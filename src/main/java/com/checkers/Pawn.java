package com.checkers;

public class Pawn extends Figure{

    public Pawn(String color) {
        super(color);
    }
    @Override
    public String toString(){
        return " P" + this.color + " ";
    }
}
