package ApkPeminjamanBuku;

import java.util.ArrayList;

public class Mahasiswa {
    private String  NIM;
    private String nama;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Mahasiswa(String NIM, String nama){
        this.NIM = NIM;
        this.nama = nama;
    }

    public void pinjam(Buku buku) {
        daftarBuku.add(buku);
    }

    public String getNIM() {
        return NIM;
    }

    public String getnama() {
        return nama;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
