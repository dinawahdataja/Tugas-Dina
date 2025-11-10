package com.Tugas2;

import java.util.Scanner;

public class Pengulangan1 {
    public static void main(String[] args){
    int batasAtas = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan Batas Atas: ");
    batasAtas = in.nextInt();
    for (int x = 1; x <= batasAtas; x++) {
        System.out.println(x);
    }
    in.close();
}
}
