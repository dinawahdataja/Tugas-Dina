package com.Tugas2;
import java.util.Scanner;

public class loopingcobain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar harga barang
        String[] daftarBarang = {"Beras", "Gula", "Minyak Goreng", "Sabun", "Telur"};
        int[] hargaBarang = {55000, 10000, 56000, 15000, 2500};

        System.out.print("Jumlah barang yang dibeli? ");
        int jumlahBarangBeli = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        // Array untuk menyimpan nama dan jumlah barang yang dibeli
        String[] namaBarangBeli = new String[jumlahBarangBeli];
        int[] jumlahBarangBeliArray = new int[jumlahBarangBeli];

        for (int i = 0; i < jumlahBarangBeli; i++) {
            System.out.print("Nama Barang " + (i + 1) + " : ");
            namaBarangBeli[i] = scanner.nextLine();

            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            jumlahBarangBeliArray[i] = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline
        }

        // Hitung total harga
        int totalHarga = 0;
        System.out.println("\nDetail Pembelian:");
        for (int i = 0; i < jumlahBarangBeli; i++) {
            int hargaSatuan = 0;
            boolean barangDitemukan = false;
            for (int j = 0; j < daftarBarang.length; j++) {
                if (namaBarangBeli[i].equalsIgnoreCase(daftarBarang[j])) {
                    hargaSatuan = hargaBarang[j];
                    barangDitemukan = true;
                    break;
                }
            }
            if (barangDitemukan) {
                int subtotal = hargaSatuan * jumlahBarangBeliArray[i];
                totalHarga += subtotal;
                System.out.println(namaBarangBeli[i] + " x " + jumlahBarangBeliArray[i] + " = " + subtotal);
            } else {
                System.out.println(namaBarangBeli[i] + " tidak ditemukan di daftar barang.");
            }
        }

        System.out.println("Total Harga: " + totalHarga);
        scanner.close();
    }
}
