/****
 * Name: Tejas Mehta
 * Date: April 12, 2019
 * Lab Name: Lab8.19-Project Tic Tac Toe
 * Extra: Asked for user's names, and showed that instead of player 1 & 2
 */
package com.tejasmehta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String player1 = "";
    //Player names
    private static String player2 = "";
    public static void main(String[] args) {
        //Init vars and welcome
        Scanner in = new Scanner(System.in);
        Welcome(in);
        char[][] board = new char[3][3];
        //Loop through, game play
        for(int i = 0; i < 9; i++) {
            String currentPlayer = i % 2 == 0 ? player1 : player2;
            ShowGameBoard(board);
            //Make sure space isnt taken and put place
            while(true) {
                System.out.println(currentPlayer + " please enter a row");
                int row = in.nextInt();
                System.out.println(currentPlayer + " please enter a column.");
                int column = in.nextInt();
                if (board[row - 1][column - 1] == 'X' || board[row - 1][column - 1] == 'O') {
                    System.out.println("Please enter another row and column");
                } else {
                    board[row - 1][column - 1] = i % 2 == 0 ? 'X' : 'O';
                    break;
                }
            }
            //Check for a win
            if (CheckWinner(board, i % 2 == 0 ? 'X' : 'O')) {
                System.out.println(currentPlayer + " wins!");
                ShowGameBoard(board);
                break;
            }
        }
    }
    //Function to welcome & get name
    private static void Welcome(Scanner in) {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Enter player 1's name:");
        player1 = in.nextLine();
        System.out.println("Enter player 2's name:");
        player2 = in.nextLine();
        System.out.println("Player 1 will be 'x' and Player 2 will be 'o'");
    }
    //Function to show the board
    private static void ShowGameBoard(char[][] board) {
        System.out.println("The current board: ");
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    //Function to check for winner
    private static boolean CheckWinner(char[][] board, char checkFor) {
        boolean won = false;
        if (board[0][0] == checkFor || board[1][0] == checkFor || board[2][0] == checkFor) {
            won = CheckRow(board, checkFor);
        }
        if ((board[0][0] == checkFor || board[0][1] == checkFor || board[0][2] == checkFor) && !won) {
            won = CheckCol(board, checkFor);
        }
        if ((board[0][0] == checkFor || board[2][0] == checkFor || board[0][2] == checkFor || board[2][2] == checkFor) && !won) {
            won = CheckDiag(board, checkFor);
        }
        return won;
    }
    //Check row win
    private static boolean CheckRow(char[][] board, char check) {
        boolean won = false;
        //All ways to row win
        if ((board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][0] == check) {
            won = true;
        } else if ((board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][0] == check) {
            won = true;
        } else if ((board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][0] == check) {
            won = true;
        }
        return won;
    }
    //Check column win
    private static boolean CheckCol(char[][] board, char check) {
        boolean won = false;
        //All ways to column win
        if ((board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[0][0] == check) {
            won = true;
        } else if ((board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[0][1] == check) {
            won = true;
        } else if ((board[0][2] == board[1][2] && board[1][2] == board[2][2]) && board[0][2] == check) {
            won = true;
        }
        return won;
    }
    //Check Diagonal win
    private static boolean CheckDiag(char[][] board, char check) {
        boolean won = false;
        //all ways to diag win
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[0][0] == check) {
            won = true;
        } else if ((board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[0][2] == check) {
            won = true;
        }
        return won;
    }
}
