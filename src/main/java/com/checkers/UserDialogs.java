package com.checkers;

import java.util.Scanner;

public class UserDialogs {
    public static String getNextMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter next move (i.e. A2B3), or type QUIT to exit");
            String result = scanner.nextLine().toUpperCase();
            if (result.length() != 4) {
                System.out.println("Wrong move");
            } else {
                return result;
            }
        }
    }
    public static UserMove translateToMove(String userMove) {
        int row1 = userMove.substring(0,1).charAt(0)-'A';
        int col1 = userMove.substring(1,2).charAt(0)-'1';
        int row2 = userMove.substring(2,3).charAt(0)-'A';
        int col2 = userMove.substring(3,4).charAt(0)-'1';
        return new UserMove(row1,col1,row2,col2);
    }
}
