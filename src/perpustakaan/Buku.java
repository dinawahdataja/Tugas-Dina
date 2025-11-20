package perpustakaan;

public class Buku {
    String judul;
    int tahunTerbit;
    Penulis[] penulis;

    Buku(String judul, int tahunTerbit, Penulis[] penulis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penulis = penulis;
    }

}
