package ApkPeminjamanBuku;

public class Buku {
    private String ISBN;
    private String judul;

    public Buku(String ISBN, String judul) {
        this.ISBN = ISBN;
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getJudul() {
        return judul;
    }
}
