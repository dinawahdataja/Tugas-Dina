package lab;
import java.util.Scanner;  // Untuk input
import java.util.Arrays;   // Untuk menampilkan array

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Buat scanner untuk input
        int[] array = new int[5];  // Array dengan 5 elemen
        
        // Ambil 5 bilangan dari pengguna
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();  // Simpan bilangan ke array
        }
        
        System.out.println("\nArray asli: " + Arrays.toString(array));  // Tampilkan array asli
        
        // Sorting sederhana dengan bubble sort (langsung di main)
        int n = array.length;  // n = 5
        for (int i = 0; i < n - 1; i++) {  // Loop untuk setiap putaran (sekarang pakai n)
            for (int j = 0; j < n - i - 1; j++) {  // Bandingkan elemen
                if (array[j] < array[j + 1]) {  // Jika elemen sekarang lebih kecil dari yang berikutnya
                    // Tukar posisi
                    int temp = array[j];  // Simpan nilai sementara
                    array[j] = array[j + 1];  // Tukar
                    array[j + 1] = temp;  // Tukar balik
                }
            }
        }
        
        System.out.println("Array setelah diurutkan (dari besar ke kecil): " + Arrays.toString(array));  // Tampilkan array yang sudah diurutkan
        
        scanner.close();  // Tutup scanner
    }
}

