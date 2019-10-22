package com.tejasmehta;

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Maze {
    private int[][] maze;
    private int M = 0;
    private int N = 0;
    String msg = "";

    Maze(int[][] m) {
        maze = m;
        M = m.length;
        N = m.length;
    }

    void solve(int[][] mat) {
        mat = maze;
        int[][] visited = new int[M][N];

        int min_dist = findShortestPath(mat, visited, 0, 0, 7, 5,
                Integer.MAX_VALUE, 0);

        if(min_dist != Integer.MAX_VALUE) {
           msg = "The shortest path from source to destination "
                    + "has length " + min_dist;
        }
        else {
            msg = "Destination can't be reached from source";
        }
    }



    // Check if it is possible to go to (x, y) from current position. The
    // function returns false if the cell has value 0 or already visited
    private  boolean isSafe(int mat[][], int visited[][], int x, int y) {
        return !(mat[x][y] == 0 || visited[x][y] != 0);
    }

    // if not a valid position, return false
    private  boolean isValid(int x, int y) {
        return (x < M && y < N && x >= 0 && y >= 0);
    }

    // Find Shortest Possible Route in a Matrix mat from source cell (0, 0)
    // to destination cell (x, y)

    // 'min_dist' stores length of longest path from source to destination
    // found so far and 'dist' maintains length of path from source cell to
    // the current cell (i, j)

    private int findShortestPath(int mat[][], int visited[][],
                                        int i, int j, int x, int y, int min_dist, int dist) {
        // if destination is found, update min_dist
        if (i == x && j == y) {
            return Integer.min(dist, min_dist);
        }

        // set (i, j) cell as visited
        visited[i][j] = 1;

        // go to bottom cell
        if (isValid(i + 1, j) && isSafe(mat, visited, i + 1, j)) {
            min_dist = findShortestPath(mat, visited, i + 1, j, x, y,
                    min_dist, dist + 1);
        }

        // go to right cell
        if (isValid(i, j + 1) && isSafe(mat, visited, i, j + 1)) {
            min_dist = findShortestPath(mat, visited, i, j + 1, x, y,
                    min_dist, dist + 1);
        }

        // go to top cell
        if (isValid(i - 1, j) && isSafe(mat, visited, i - 1, j)) {
            min_dist = findShortestPath(mat, visited, i - 1, j, x, y,
                    min_dist, dist + 1);
        }

        // go to left cell
        if (isValid(i, j - 1) && isSafe(mat, visited, i, j - 1)) {
            min_dist = findShortestPath(mat, visited, i, j - 1, x, y,
                    min_dist, dist + 1);
        }

        // Remove (i, j) from visited matrix
        visited[i][j] = 0;

        return min_dist;
    }

    @Override
    public String toString() {
        return msg;
    }
}
