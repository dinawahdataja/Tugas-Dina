package com.Tugas2;
import java.util.Scanner;
public class latihanUTP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

    for (a = 1; a<= 10; a++){
        for (b = 1; b<=a; b++){
            System.out.print(" * ");
        }
        System.out.println(" ");
    }


        input.close(); 
    }
    
}
