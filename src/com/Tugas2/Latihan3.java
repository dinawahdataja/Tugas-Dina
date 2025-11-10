package com.Tugas2;

import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

    System.out.print("Jam Kerja = ");
    int Jamkerja = input.nextInt();

    int upahPerJam = 5000;
    int upahLemburPerJam = 6000;
    int dendaPerJam = 1000;

    int upah = 0;
    int lembur = 0;
    int denda = 0;

    if (Jamkerja > 60) {
        upah = 60 * upahPerJam;
        lembur = (Jamkerja - 60) * upahLemburPerJam;
        denda = 0;
    } else if (Jamkerja >= 50) {
        upah = Jamkerja * upahPerJam;
        lembur = 0;
        denda = 0;
    } else {
        upah = Jamkerja * upahPerJam;
        lembur = 0;
        denda = (50 - Jamkerja) * dendaPerJam;
    }
    int total = upah + lembur - denda;

    System.out.println("upah = Rp. " + upah);
    System.out.println("lembur = Rp. " + lembur);
    System.out.println("denda = Rp. " + denda);
    System.out.println("-------------------");
    System.out.println("Total = Rp. " + total);

    input.close();
    }
   
    
}
