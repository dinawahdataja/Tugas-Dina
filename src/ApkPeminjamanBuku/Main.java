package ApkPeminjamanBuku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan NIM     : ");
        String NIM = in.nextLine();
        System.out.print("Masukkan Nama     : ");
        String nama = in.nextLine();

        Mahasiswa mhs = new Mahasiswa(NIM,nama);

        System.out.println();
        System.out.println("Berapa Buku yang ingin dipinjam? ");
        int jumlah = in.nextInt();
        in.nextLine();

        for (int i = 1; i<= jumlah; i++) {
            System.out.println("\nBuku ke-" + i);
            System.out.print("ISBN : ");
            String ISBN = in.nextLine();

            System.out.print("Judul : ");
            String judul = in.nextLine();

            Buku buku = new Buku(ISBN, judul);
            mhs.pinjam(buku);
        }


        System.out.println();
        System.out.println("============================================");
        System.out.println("NIM  : " + mhs.getNIM());
        System.out.println("Nama : " + mhs.getnama());
        System.out.println("---------------------------------------------");
        System.out.printf("| %-3s | %-10s| %-40s| \n", "No", "ISBN", "Judul Buku");
        System.out.println("----------------------------------------------");

        int no = 1;
        for (Buku b : mhs.getDaftarBuku()) {
            System.out.printf("| %-3d | %-10s | %-40s |\n", no++, b.getISBN(), b.getJudul());
        }
        System.out.println("-----------------------------------------------");
        
        in.close();
    }
}
