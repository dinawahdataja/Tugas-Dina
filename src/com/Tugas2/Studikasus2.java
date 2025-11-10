package com.Tugas2;

import java.util.Scanner;

public class Studikasus2 {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input batas atas mulai perulangan.");
    int batasAtas = in.nextInt();
    
    int i = batasAtas;
    while (i >=1) {
        int j = 1;
        while (j >= 1) {
            System.out.print(j + ""); j++;}

            System.out.println();
            i--;

            in.close();
    }

 }
}