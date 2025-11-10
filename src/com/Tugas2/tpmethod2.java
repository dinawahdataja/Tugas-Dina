package com.Tugas2;

import java.util.Scanner;

public class tpmethod2 {

    static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void tampilkanPrima1sampai100() {
        System.out.println("Bilangan Prima dari 1 sampai 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bilangan = in.nextInt();

        if (isPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
        tampilkanPrima1sampai100();
        in.close();
    }
}
