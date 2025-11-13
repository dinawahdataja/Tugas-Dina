package com.Tugas2;

import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    private String KodeMatkul;
    private String NamaMatkul;
    private int sks;

    public MataKuliah(String kodeMatkul, String NamaMatkul, int sks) {
        this.KodeMatkul = kodeMatkul;
        this.NamaMatkul = NamaMatkul;
        this.sks = sks;

    }

    public int getSks() {
        return sks;
    }

    public void tampilkanMatkul() {
        System.out.printf("%-10s %-25s %-5d\n", KodeMatkul, NamaMatkul, sks);
    }

}

class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<MataKuliah> daftarMatkul = new ArrayList<>();
    private static final int maxSks = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tambahMK(MataKuliah mk) {
        int totalSKS = hitungTotalSKS();
        if (totalSKS + mk.getSks() <= maxSks) {
            daftarMatkul.add(mk);
        } else {
            System.out.println("⚠️ SKS melebihi batas maksimal (24 SKS). Mata kuliah tidak dapat ditambahkan!");
        }
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (MataKuliah mk : daftarMatkul) {
            total += mk.getSks();
        }
        return total;
    }

    public void cetakKRS() {
        System.out.println("\n===== KARTU RENCANA STUDI (KRS) =====");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("--------------------------------------");
        System.out.printf("%-10s %-25s %s\n", "Kode MK", "Nama Mata Kuliah", "SKS");
        System.out.println("--------------------------------------");
        for (MataKuliah mk : daftarMatkul) {
            mk.tampilkanMatkul();
        }
        System.out.println("--------------------------------------");
        System.out.println("Total SKS: " + hitungTotalSKS());
        System.out.println("\nTanda tangan KPS: _____________________");
        System.out.println("Nama Mahasiswa : " + nama + " (" + nim + ")");
    }
}

public class krsMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PENGISIAN KRS MAHASISWA ===");
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        while (true) {
            System.out.print("\nMasukkan Kode Mata Kuliah: ");
            String kode = input.nextLine();

            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMK = input.nextLine();

            System.out.print("Masukkan Jumlah SKS: ");
            int sks = input.nextInt();
            input.nextLine(); // buang newline

            MataKuliah mk = new MataKuliah(kode, namaMK, sks);
            mhs.tambahMK(mk);

            System.out.print("Apakah ingin menambah mata kuliah lagi? (y/n): ");
            String pilih = input.nextLine();
            if (pilih.equalsIgnoreCase("n")) {
                break;
            }
        }

        mhs.cetakKRS();
        input.close();
    }
}
