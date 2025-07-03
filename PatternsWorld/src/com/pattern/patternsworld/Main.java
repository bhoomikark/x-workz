package com.pattern.patternsworld;

public class Main {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern(4, 5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //after printing one row
            System.out.println();
        }
        System.out.println("==============================");
    }

    static void pattern2(int m) {
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===================================");
    }

    static void pattern3(int p) {
        for (int row = 1; row <= p; row++) {
            for (int col = p; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=============================");

    }

    static void pattern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}





