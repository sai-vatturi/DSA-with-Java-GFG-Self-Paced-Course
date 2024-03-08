package classlectures.cat;

public class RatMazeSolving {

    static int[][] sol;

    static boolean isSafe(int[][] matrix, int x, int y) {
        return x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && matrix[x][y] == 1;
    }

    public static boolean solveMaze(int[][] maze, int x, int y) {
        int row = maze.length;;
        int col = maze[0].length;

        if (x ==  row - 1 && y == col - 1) {
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(maze, x, y)) {
            sol[x][y] = 1;
            if (solveMaze(maze, x + 1, y)){
                return true;
            }
            if (solveMaze(maze, x, y+1))
                return true;
            //back track
            sol[x][y] = 0;
        }
        return false;
    }


    public static void main(String[] args) {
        int maze[][] = {
                {1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1}
        };

        sol = new int[maze.length][maze[0].length];

        if (solveMaze(maze, 0, 0)) {
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[0].length; j++)
                    System.out.print(" " + sol[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
