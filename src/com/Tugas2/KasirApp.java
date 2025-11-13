package com.Tugas2;
import java.util.Scanner;

public class KasirApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah barang yang dibeli? ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] namaBarang = new String[n];
        int[] jumlahBarang = new int[n];
        double[] hargaSatuan = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama Barang " + (i + 1) + " : ");
            namaBarang[i] = input.nextLine();

            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            jumlahBarang[i] = input.nextInt();

            System.out.print("Harga Satuan Barang " + (i + 1) + " : ");
            hargaSatuan[i] = input.nextDouble();
            input.nextLine(); 
        }

        System.out.println("\nDaftar Barang yang Dibeli:");
        System.out.println("No.\tNama Barang\tJumlah\tHarga Satuan\tTotal Harga");
        double totalBayar = 0;
        for (int i = 0; i < n; i++) {
            double totalHarga = jumlahBarang[i] * hargaSatuan[i];
            totalBayar += totalHarga;
            System.out.printf("%d\t%s\t\t%d\tRp.%.2f\tRp.%.2f\n", (i + 1), namaBarang[i], jumlahBarang[i], hargaSatuan[i], totalHarga);
        }

        System.out.printf("\nTotal yang harus dibayar: Rp.%.2f\n",totalBayar);

        input.close();
    }
}