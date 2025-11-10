package com.Tugas2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan(kg)\t: ");
        Double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badang(m)\t: ");
        Double tinggi = input.nextDouble();

        Double IMT = berat/(tinggi * tinggi);

        System.out.printf("Nilai IMT Anda: %.2f", IMT);

        if (IMT <= 18.5) { 
            System.out.println(" Termasuk Kurus");
        } else if (IMT <= 25) {
            System.out.println(" Termasuk Normal");
        } else if (IMT <= 30) {
            System.out.println(" Termasuk Gemuk");
        } else {
            System.out.println(" Termasuk Kegemukan");
        }

        input.close();
    }

    
}
