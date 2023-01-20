package L12;

import java.util.Random;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static Random rd = new Random();

    public static void main(String[] args) {

        int num = rd.nextInt(26) + 'a';
        int[] a = new int[30];

        fillArr(a);
        a = fillArr(15);

        int[][] mat = generate_Matrix(6, 6);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 != 0)

                    if (j % 2 == 0) {
                        System.out.print(ANSI_GREEN);
                        System.out.print(mat[i][j] + " ");
                        System.out.print(ANSI_RESET);
                    } else
                        System.out.print(mat[i][j] + " ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i % 2 != 0) {
                    System.out.print(ANSI_GREEN);
                    System.out.print(mat[i][j] + " ");
                    System.out.print(ANSI_RESET);
                } else
                    System.out.print(mat[i][j] + " ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
    }

    public static int[] fillArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    public static void fillArr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            fillArr(mat[i]);
        }
    }

    public static int[][] generate_Matrix(int row, int col) {
        if (row < 0 || col < 0)
            return null;
        int[][] mat = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = rd.nextInt(10);
            }

        }


        return mat;
    }

    public boolean isPositive(int[][] matrix) {

        int sumEven = 0;
        int sumOdd = 0;
        //{ {1,2,3,4},
        //  {5,6,7,8}
        //  {9,8,7,6}
        //}
        // 5+6+7+8<1+3+5+7+9+7


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0)
                    sumEven += matrix[i][j];
                if (i % 2 != 0)
                    sumOdd += matrix[i][j];
            }
        }

        return sumOdd < sumEven;
    }

}
