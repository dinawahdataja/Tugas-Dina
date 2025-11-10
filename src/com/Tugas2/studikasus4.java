import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class studikasus4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] angka = new Integer[5]; // Array dengan panjang 5

        // Input nilai ke dalam array
        System.out.println("Masukkan 5 bilangan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Sorting descending
        Arrays.sort(angka, Collections.reverseOrder());

        // Output hasil sorting
        System.out.println("\nArray setelah diurutkan (descending):");
        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }
    }
}