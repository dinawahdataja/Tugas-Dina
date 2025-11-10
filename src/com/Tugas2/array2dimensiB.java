package com.Tugas2;
import java.util.Scanner;

public class array2dimensiB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] n = new int[3][3];

        // Input manual dari user
        System.out.println("Masukkan elemen array 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("n[" + i + "][" + j + "] = ");
                n[i][j] = input.nextInt();
            }
        }

        // Cetak array asli
        System.out.println("\nArray Asli:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        // Proses transpose
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = n[i][j];
            }
        }

        // Cetak array transpose
        System.out.println("\nArray Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}