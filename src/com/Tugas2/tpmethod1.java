package com.Tugas2;
import java.util.Scanner;

public class tpmethod1 {

    static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    
    static int permutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nProgram Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nilai n : ");
                int n = input.nextInt();
                System.out.print("Masukkan nilai r : ");
                int r = input.nextInt();

                int hasil = permutasi(n, r);

                System.out.println("\n         n");
                System.out.println("\n nPr = ----- = " + hasil);
                System.out.println("       (n-r)!");
                System.out.println("Maka Hasil Permutasinya adalah : " + hasil);

            } else if (pilihan == 2) {
                System.out.print("Masukkan nilai n : ");
                int n = input.nextInt();
                System.out.print("Masukkan nilai r : ");
                int r = input.nextInt();

                int hasil = kombinasi(n, r);

                System.out.println("\n         n");
                System.out.println("\n nCr = ----- = " + hasil);
                System.out.println("      (n-r)! x r!");
                System.out.println("Maka Hasil Kombinasinya adalah : " + hasil);

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan program ini!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }

        } while (pilihan != 3);

        input.close();
    }
}
