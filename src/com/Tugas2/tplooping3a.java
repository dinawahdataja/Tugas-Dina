package com;
import java.util.Scanner;

public class tplooping3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = input.nextDouble();
                    double volBalok = p * l * t;
                    System.out.printf("Volume Balok = %.2f\n", volBalok);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari bola: ");
                    double rBola = input.nextDouble();
                    double volBola = (4.0 / 3.0) * Math.PI * Math.pow(rBola, 3);
                    System.out.printf("Volume Bola = %.2f\n", volBola);
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari alas kerucut: ");
                    double rKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tKerucut = input.nextDouble();
                    double volKerucut = (1.0 / 3.0) * Math.PI * Math.pow(rKerucut, 2) * tKerucut;
                    System.out.printf("Volume Kerucut = %.2f\n", volKerucut);
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari silinder: ");
                    double rSilinder = input.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double tSilinder = input.nextDouble();
                    double volSilinder = Math.PI * Math.pow(rSilinder, 2) * tSilinder;
                    System.out.printf("Volume Silinder = %.2f\n", volSilinder);
                    break;

                case 5:
                    System.out.print("Masukkan luas alas segitiga: ");
                    double luasAlas = input.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tLimas = input.nextDouble();
                    double volLimas = (1.0 / 3.0) * luasAlas * tLimas;
                    System.out.printf("Volume Limas Segitiga = %.2f\n", volLimas);
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
            }
        } while (pilihan != 0);

        input.close();
    }
}