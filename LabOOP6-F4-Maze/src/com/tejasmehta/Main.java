package com.tejasmehta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/maze.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int[][] maze = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    maze[i][j]=scanner.nextInt();
                }
            }
            Maze m = new Maze(maze);
            m.solve(maze);
            System.out.println(m);
        }
    }
}
