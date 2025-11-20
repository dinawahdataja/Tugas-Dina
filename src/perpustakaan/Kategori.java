package perpustakaan;

public class Kategori {
    String namaKategori;
    Buku[] daftarBuku;   
    Kategori(String namaKategori, Buku[] daftarBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = daftarBuku;
    }
}
