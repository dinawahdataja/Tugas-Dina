package lab;

import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }

    public void tampilkanHasil() {
        System.out.println("Alas   : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas Segitiga = " + hitungLuas());
        System.out.println("Keliling Segitiga = " + hitungKeliling());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        Segitiga segitiga1 = new Segitiga(alas, tinggi);

        System.out.println("\n=== HASIL PERHITUNGAN SEGITIGA ===");
        segitiga1.tampilkanHasil();

        input.close();

    }
}