package com.Tugas2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class studikasus4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] angka = new Integer[5]; 

        System.out.println("Masukkan 5 bilangan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        Arrays.sort(angka, Collections.reverseOrder());

        System.out.println("\nArray setelah diurutkan (descending):");
        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }
        input.close();
    }
}