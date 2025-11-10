
package lab;
import java.util.Scanner;

public class StudikasusArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[3];
        
        System.out.println("Masukkan 3 elemen :");
        for (int i = 0; i < 3; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        int jumlah = 0;
        for (int i = 0; i < 3; i++) {
            jumlah += array[i];
        }
        
        System.out.print("Array yang dimasukkan: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i]);
            if (i < 2) {  
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Jumlah total elemen array: " + jumlah);
        
        scanner.close();
    }
}