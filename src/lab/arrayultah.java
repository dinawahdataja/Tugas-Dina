package lab;

public class arrayultah {
    public static void main(String[] args) {
       int [] ultah = new int[4];
       ultah[0] = 2;
       ultah[1] = 12;
       ultah[2] = 21;
       ultah[3] = 25;

       System.out.println("Daftar tanggal ulang tahun siswa: ");
       for (int i = 0; i < ultah.length; i++){
        System.out.println("ulang tahun siswa ke- " + (i+1) + " = " + ultah[i]);
       }

    }
    
}
