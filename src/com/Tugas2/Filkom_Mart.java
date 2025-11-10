package com.Tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class Filkom_Mart {

    static class Barang {
        private String nama;
        private double hargaSatuan;
        private int jumlah;

        public Barang(String n, double h, int j) {
            nama = n;
            hargaSatuan = h;
            jumlah = j;
        }

        public String getNama() {
            return nama;
        }

        public double getHargaSatuan() {
            return hargaSatuan;
        }

        public int getJumlah() {
            return jumlah;
        }

        public double getTotalHarga() {
            return hargaSatuan * jumlah;
        }
    }

    public static class FilkomMart {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Barang> daftarBarang = new ArrayList<>();

            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int n = input.nextInt();
            input.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("\nBarang ke-" + (i + 1));
                System.out.print("Nama barang: ");
                String namaBarang = input.nextLine();

                System.out.print("Harga satuan: ");
                double harga = input.nextDouble();

                System.out.print("Jumlah satuan: ");
                int jumlah = input.nextInt();
                input.nextLine();

                daftarBarang.add(new Barang(namaBarang, harga, jumlah));
            }

            System.out.println("\n======= STRUK BELANJA FILKOMMART =======");
            System.out.printf("%-20s %-10s %-10s %-10s\n", "Nama Barang", "Harga", "Jumlah", "Total");
            System.out.println("---------------------------------------------");

            double totalBelanja = 0;
            for (Barang b : daftarBarang) {
                System.out.printf("%-20s %-10.2f %-10d %-10.2f\n",
                        b.getNama(), b.getHargaSatuan(), b.getJumlah(), b.getTotalHarga());
                totalBelanja += b.getTotalHarga();
            }

            System.out.println("---------------------------------------------");
            System.out.printf("Total Belanja: Rp %.2f\n", totalBelanja);
            System.out.println("=============================================");

            input.close();
        }
    }

}
