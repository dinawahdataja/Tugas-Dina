package com.Tugas2;
public class tplooping2 {
    public static void main(String[] args) {
        int tinggi = 7; 
        int lebar = 6;  

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebar; j++) {
                
                if (j == 0) {
                    System.out.print("D");
                } else if ((i == 0 || i == tinggi - 1) && j < lebar - 1) {
                    System.out.print("D");
                } else if (j == lebar - 1 && i > 0 && i < tinggi - 1) {
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}