package com.Tugas2;

import java.util.Scanner;

public class remedUTS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris = input.nextInt();
        int kolom = input.nextInt();

        if (baris <= 0 || kolom <= 0) {
            System.out.println("Input tidak sesuai");
            return;
        }

        String[][] peta = new String[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                peta[i][j] = ".";
            }
        }

        int jumlahMember = input.nextInt();

        int kBaris = -1, kKolom = -1;

        for (int i = 0; i < jumlahMember; i++) {
            int r = input.nextInt();
            int c = input.nextInt();
            String simbol = input.next();

            if (r < 0 || r >= baris || c < 0 || c >= kolom) {
                System.out.println("Input tidak sesuai");
                return;
            }

            peta[r][c] = simbol;

            if (simbol.equals("K")) {
                kBaris = r;
                kKolom = c;
            }
        }

        if (kBaris != -1 && kKolom != -1) {

            for (int i = kBaris - 1; i >= 0; i--) {
                if (peta[i][kKolom] == ".") {
                    peta[i][kKolom] = "*";
                } else if (peta[i][kKolom] == "W" || peta[i][kKolom] == "N" || peta[i][kKolom] == "G") {
                    break;
                }
            }

            for (int i = kBaris + 1; i < baris; i++) {
                if (peta[i][kKolom] == ".") {
                    peta[i][kKolom] = "*";
                } else if (peta[i][kKolom] == "W" || peta[i][kKolom] == "N" || peta[i][kKolom] == "G") {
                    break;
                }
            }

            for (int j = kKolom - 1; j >= 0; j--) {
                if (peta[kBaris][j] == ".") {
                    peta[kBaris][j] = "*";
                } else if (peta[kBaris][j] == "W" || peta[kBaris][j] == "N" || peta[kBaris][j] == "G") {
                    break;
                }
            }

            for (int j = kKolom + 1; j < kolom; j++) {
                if (peta[kBaris][j] == ".") {
                    peta[kBaris][j] = "*";
                } else if (peta[kBaris][j] == "W" || peta[kBaris][j] == "N" || peta[kBaris][j] == "G") {
                    break;
                }
            }

            peta[kBaris][kKolom] = "K";
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(peta[i][j]);
                if (j < kolom - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }

        input.close();
    }
}
