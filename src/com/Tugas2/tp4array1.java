package com;

import java.util.Scanner;

public class tp4array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan, b = 0, c = 0, z = 0, t = 0;
        int a[] = null;
        boolean kondisi = false;


        while (true) {
            System.out.println("\n==== MENU PROGRAM ARRAY ====");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average (Rata-rata)");
            System.out.println("4. Sum (Jumlah)");
            System.out.println("5. Max (Maksimum)");
            System.out.println("6. Min (Minimum)");
            System.out.println("7. Keluar");
            System.out.print("Masukkan Pilihan: ");
            pilihan = in.nextInt();

           switch (pilihan) {
            case 1: 
            kondisi = true;
            System.out.print("Masukkan banyaknya data: ");
            b = in.nextInt();
            a = new int[b];
            for (int i = 0; i < b; i++) {
                System.out.print("Masukkan data ke-" + (i + 1) + ": ");
                a[i] = in.nextInt();        
           }
            break;
            case 2:
                if (kondisi == false) {
                    System.out.println("Data: ");}
                    else {
                    for (int i = 0; i < b; i++) {
                        System.out.print(a[i] + " ");
                    }
                }  
                break;
            case 3:
                if (kondisi == false) {
                    System.out.println("Masukkan Array Pada Pilihan 1");}
                    else {
                    for (int i = 0; i < b; i++) {
                        c += a[i];
                    }
                    z = c / b;
                    System.out.println("Rata-rata: " + z);
                }
                break;
            case 4:
                if (kondisi == false) {
                    System.out.println("Masukkan Array Pilihan 1");}
                    else {
                    System.out.println("Jumlah: " + c);
                }
                break;
            case 5:
                if (kondisi == false) {
                   System.out.println("Masukkan Array Pada Pilihan 1");}
                else {
                    for (int i = 1; i < b; i++) {
                        if (a[i] > t) {
                            t = a[i];
                        }
                    }
                    System.out.println("Maksimum: " + t);
                }
                break;
            case 6:
                if (kondisi == false) {
                     System.out.println("Masukkan Array Pada Pilihan 1");}
                else {
                    for (int i = 1; i < b; i++) {
                        if (a[i] < t) {
                            t = a[i];
                        }
                    }
                    System.out.println("Minimum: " + t);
                }
                break;
            case 7:
                System.out.println("Keluar dari program.");
                in.close();
                return;
            default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
           }
        }
    }
}
            