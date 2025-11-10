package com.Tugas2;
public class array2dimensi {
    public static void main(String[] a) {
        int[][] n = new int[3][3];  
        for (int i = 0; i < 3; i++) {
            n[i][0] = 0;  
            n[i][1] = 1;  
            n[i][2] = 2; 
        }
        System.out.println("Array Asli:");
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = n[i][j]; 
            }
        }
        System.out.println("\nArray Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
