package com.pixel.wissentech;

import java.util.HashSet;
import java.util.Set;

/*
* Write a program to determine if a 9 x 9 Sudoku board is valid.
    The rules that need to be checked if the Sudoku grid is valid are :
        1.Each row must contain the digits 1-9 without repetition.
        2.Each column must contain the digits 1-9 without repetition.
        3.Each of the nine 3 x 3 sub-boxes of the grid must contain
         the digits 1-9 without repetition.

     Example 1 :
            {{'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}}
            Output: true

      Example 2 :
            {{'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}}
            Output: false
            * */
public class SudokuSol {
    public static void main(String[] args) {
       char[][] board = {
               {'5','3','.','.','7','.','.','.','.'},
               {'6','.','.','1','9','5','.','.','.'},
               {'.','9','8','.','.','.','.','6','.'},
               {'8','.','.','.','6','.','.','.','3'},
               {'4','.','.','8','.','3','.','.','1'},
               {'7','.','.','.','2','.','.','.','6'},
               {'.','6','.','.','.','.','2','8','.'},
               {'.','.','.','4','1','9','.','.','5'},
               {'.','.','.','.','8','.','.','7','9'}};
       char[][] board2 =
               {{'8','3','.','.','7','.','.','.','.'},
               {'6','.','.','1','9','5','.','.','.'},
               {'.','9','8','.','.','.','.','6','.'},
               {'8','.','.','.','6','.','.','.','3'},
               {'4','.','.','8','.','3','.','.','1'},
               {'7','.','.','.','2','.','.','.','6'},
               {'.','6','.','.','.','.','2','8','.'},
               {'.','.','.','4','1','9','.','.','5'},
               {'.','.','.','.','8','.','.','7','9'}};
        boolean sudoku = isSudoku(board);
        System.out.println(sudoku);
    }
    public static boolean isSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i =0 ;i < 9 ; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for (int r = 0; r< 9; r++) {
            for (int c = 0; c <9; c++) {
                char current = board[r][c];

                if (current == '.') {
                    continue;
                }
                if (rows[r].contains(current)) {
                    return false;
                }
                rows[r].add(current);

                if (cols[c].contains(current)) {
                    return false;
                }
                cols[c].add(current);

                int boxIndex = (r / 3) * 3 + (c / 3);
                if (boxes[boxIndex].contains(current)){
                    return false;
                }
                boxes[boxIndex].add(current);
            }
        }
        return true;
    }
}
