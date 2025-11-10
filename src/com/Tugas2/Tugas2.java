package com.Tugas2;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");
        System.out.print("Masukkan Nama                  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kelurahan             : ");
        String kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        int awal = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter: ");
        int akhir = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini  : ");
        int tarif = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)    : ");
        int ppj = input.nextInt();

        int pemakaian = akhir - awal;
        int totalTarif = pemakaian * tarif;
        int pajak = (totalTarif * ppj) / 100;
        int totalBayar = totalTarif + pajak;

        System.out.println("\n====================================");
        System.out.println("              PLN Java              ");
        System.out.println("====================================");
        System.out.printf("%-20s : %s%n", "Nama", nama);
        System.out.printf("%-20s : %s%n", "Kelurahan", kelurahan);
        System.out.printf("%-20s : %d Kwh Meter%n", "Pemakaian bulan ini", pemakaian);
        System.out.printf("%-20s : Rp %,d%n", "Tarif Listrik", totalTarif);
        System.out.printf("%-20s : Rp %,d%n", "PPJ " + ppj + "%", pajak);
        System.out.printf("%-20s : Rp %,d%n", "Total Bayar", totalBayar);
        System.out.println("====================================");

        input.close();
    }
}
