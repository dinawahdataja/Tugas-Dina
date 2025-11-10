package com.Tugas2;
import java.util.Scanner;

public class tp4array2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] pesananJenis = new String[100];
        int[] pesananJumlah = new int[100];
        int[] pesananTotal = new int[100];
        int pesananCount = 0;
        int jumlahTiket = 0,totalBayar = 0,diskonPersen = 0, subtotal = 0, potongan = 0;
        String[][] kereta = {
            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10", "Ada", "Ada"}
        };
        while (true) {
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai : ");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println();
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |%n", kereta[i][0], kereta[i][1], kereta[i][2] + "%", kereta[i][3], kereta[i][4]);
                    }
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println();
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();

                    for (int i = 0; i < 4; i++) {
                        if (kereta[i][3] == "Ada") {
                            System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |%n", kereta[i][0], kereta[i][1], kereta[i][2] + "%", kereta[i][3], kereta[i][4]);
                        }
                    }
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    System.out.println();
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();

                    for (int i = 0; i < 4; i++) {
                        if (kereta[i][4] == "Ada") {
                            System.out.printf("| %-15s | %-10s | %-6s | %-10s | %-10s |%n", kereta[i][0], kereta[i][1], kereta[i][2] + "%", kereta[i][3], kereta[i][4]);
                        }
                    }
                    for (int i = 0; i <= 66; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    boolean lanjutPesan = true;
                    while (lanjutPesan) {
                        System.out.println("Pilih jenis kereta (1-4): ");
                        int pilihan = in.nextInt();
                        if (pilihan < 1 || pilihan > 4) {
                            System.out.println("Pilihan tidak valid!");
                            continue;
                        }

                        System.out.print("Masukkan jumlah tiket: ");
                        jumlahTiket = in.nextInt();

                        int hargaSatuan = Integer.parseInt(kereta[pilihan - 1][1]);
                        diskonPersen = Integer.parseInt(kereta[pilihan - 1][2]);
                        subtotal = hargaSatuan * jumlahTiket;
                        potongan = subtotal * diskonPersen / 100;
                        totalBayar = subtotal - potongan;

                        pesananJenis[pesananCount] = kereta[pilihan - 1][0];
                        pesananJumlah[pesananCount] = jumlahTiket;
                        pesananTotal[pesananCount] = totalBayar;
                        pesananCount++;

                        System.out.println("\nPesanan berhasil!");
                        System.out.println("Jenis Kereta : " + kereta[pilihan - 1][0]);
                        System.out.println("Jumlah Tiket : " + jumlahTiket);
                        System.out.println("Subtotal     : Rp" + subtotal);
                        System.out.println("Diskon (" + diskonPersen + "%) : Rp" + potongan);
                        System.out.println("Total Bayar  : Rp" + totalBayar);

                        System.out.print("\nApakah ingin memesan lagi? (y/n): ");
                        String jawab = in.next();
                        if (!jawab.equalsIgnoreCase("y")) {
                            lanjutPesan = false;
                        }
                    }
                    break;
                case 5:
                    if (pesananCount == 0) {
                        System.out.println("Belum ada pesanan tiket.");
                    } else {
                        int grandTotal = 0;
                        System.out.println("Pesanan Anda:");
                        for (int i = 0; i < pesananCount; i++) {
                            System.out.println((i + 1) + ". " + pesananJenis[i] +
                                    " - " + pesananJumlah[i] + " tiket, Total Rp" + pesananTotal[i]);
                            grandTotal += pesananTotal[i];
                        }
                        System.out.println("Grand Total: Rp" + grandTotal);
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}