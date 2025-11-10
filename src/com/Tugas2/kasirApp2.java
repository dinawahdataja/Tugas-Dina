package com;

import java.util.Scanner;

public class kasirApp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarBarang = {"Beras", "Gula", "Minyak Goreng", "Sabun", "Telur"};
        int[] daftarHarga = {55000, 10000, 56000, 15000, 2500};

        System.out.print("Jumlah barang yang dibeli? ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaBarang = new String[n];
        int[] jumlahBarang = new int[n];
        int[] hargaSatuan = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Barang ke-" + (i + 1));
            System.out.print("Nama Barang : ");
            namaBarang[i] = input.nextLine();

            System.out.print("Jumlah Barang : ");
            jumlahBarang[i] = input.nextInt();
            input.nextLine();

            int harga = 0;
            for (int j = 0; j < daftarBarang.length; j++) {
                if (namaBarang[i].equalsIgnoreCase(daftarBarang[j])) {
                    harga = daftarHarga[j];
                    break;
                }
            }
            hargaSatuan[i] = harga;
        }

        int totalBayar = 0;
        System.out.println("\n=================================");
        System.out.println("          STRUK BELANJA          ");
        System.out.println("=================================");
        System.out.printf("%-15s %5s %10s %10s\n", "Barang", "Qty", "Harga", "Subtotal");
        System.out.println("---------------------------------");

        for (int i = 0; i < n; i++) {
            int subtotal = jumlahBarang[i] * hargaSatuan[i];
            totalBayar += subtotal;
            System.out.printf("%-15s %5d %10d %10d\n", 
                              namaBarang[i], jumlahBarang[i], hargaSatuan[i], subtotal);
        }

        System.out.println("---------------------------------");
        System.out.printf(".%-32s %10d\n", "TOTAL", totalBayar);
        System.out.println("=================================");
        System.out.println("   Terima Kasih sudah berbelanja ");
        System.out.println("=================================");
    }
} 
    

