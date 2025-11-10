package com.Tugas2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("Menghitung luas dan keliling persegi panjang");
        System.out.println("Menghitung luas dan keliling lingkaran");
        System.out.println("Menghitung luas dan keliling segitiga");
        System.out.println("Pilihan anda:");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Panjang   :");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar     :");
                double lebar = input.nextDouble();

                double luaspersegipanjang = panjang * lebar;
                double kelilingpersegipanjang = 2 * (panjang + lebar);

                System.out.println("Luas persegi panjang:" + luaspersegipanjang + "Cm2");
                System.out.println("Keliling persegi:" + kelilingpersegipanjang + "Cm");
                break;

            case 2:
                System.out.print("Masukkan r= ");
                double r = input.nextDouble();

                double luasLingkaran = Math.PI * r * r;
                double kelilingLingkaran = 2 * Math.PI * r;

                System.out.println("luaslingkaran:   " + String.format("%.2f", luasLingkaran) + "Cm2");
                System.out.println("kelilinglingkaran:   " + String.format("%.2f", kelilingLingkaran) + "Cm");
                break;

                case 3: System.out.print("Masukkan alas     :");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi   :");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisiA    :");
                double sisiA = input.nextDouble();
                System.out.print("Masukkan sisiB    :");
                double sisiB = input.nextDouble();
                System.out.print("Masukan sisiC     :");
                double sisiC = input.nextDouble();

                double luasSegitiga = 0.5 * alas * tinggi;
                double kelilingSegitiga = sisiA + sisiB + sisiC;

                System.out.println("luasSegitiga:" + luasSegitiga + "Cm2");
                System.out.println("kelilingSegitiga:" + kelilingSegitiga + "Cm");

            default:
                System.out.println("Data tidak ditemukan");
        }
        input.close();
    }
}
