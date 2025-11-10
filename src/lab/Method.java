package lab;

public class Method {
   static int jumlah(int[] data){
        int total = 0;
        for(int i= 0; i<data.length; i++){
            total += data [i];
        }
        return total;
    }
    public static void main(String[] args){
        int[] tglUltah = {02};
        int[] bulanUltah = {9};
        int jumlah = jumlah(tglUltah) + jumlah(bulanUltah);
        System.out.println("Total tanggal dan bulan ulang tahun: " + jumlah); 
    }
    
}
