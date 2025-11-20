package perpustakaan;

public class Main {
    public static void main(String[] args) {

        Penulis p1 = new Penulis("Dina");
        Penulis p2 = new Penulis("Budi");
        Penulis p3 = new Penulis("Fitri");
        Penulis p4 = new Penulis("Amirah");
        Penulis p5 = new Penulis("Calista");
        Penulis p6 = new Penulis("Rahman");
        Penulis p7 = new Penulis("Indra");
        Penulis p8 = new Penulis("Sari");
        Penulis p9 = new Penulis("Zahra");
        Penulis p10 = new Penulis("Wahyu");

        Buku[] teknologi = {
            new Buku("Pemrograman Java Dasar", 2023, new Penulis[]{p1}),
            new Buku("Jaringan Komputer", 2022, new Penulis[]{p2}),
            new Buku("Pengantar AI", 2021, new Penulis[]{p3, p4}),
            new Buku("Sistem Operasi", 2020, new Penulis[]{p5}),
            new Buku("Basis Data", 2023, new Penulis[]{p2})
        };

        Buku[] filsafat = {
            new Buku("Filsafat Moral", 2020, new Penulis[]{p6}),
            new Buku("Epistemologi Dasar", 2018, new Penulis[]{p7}),
            new Buku("Logika Dasar", 2019, new Penulis[]{p5}),
            new Buku("Filsafat Ilmu", 2021, new Penulis[]{p4}),
            new Buku("Etika Modern", 2022, new Penulis[]{p8})
        };

        Buku[] sejarah = {
            new Buku("Sejarah Indonesia", 2019, new Penulis[]{p9}),
            new Buku("Perang Dunia II", 2017, new Penulis[]{p10}),
            new Buku("Kerajaan Nusantara", 2018, new Penulis[]{p6}),
            new Buku("Era Revolusi", 2020, new Penulis[]{p3}),
            new Buku("Sejarah Dunia", 2016, new Penulis[]{p7})
        };

        Buku[] agama = {
            new Buku("Studi Islam", 2021, new Penulis[]{p1}),
            new Buku("Pengantar Agama", 2020, new Penulis[]{p9}),
            new Buku("Sejarah Peradaban Islam", 2018, new Penulis[]{p3}),
            new Buku("Pemikiran Ulama", 2017, new Penulis[]{p10}),
            new Buku("Etika Spiritual", 2022, new Penulis[]{p4})
        };

        Buku[] psikologi = {
            new Buku("Psikologi Dasar", 2019, new Penulis[]{p2}),
            new Buku("Psikologi Kepribadian", 2018, new Penulis[]{p8}),
            new Buku("Pengantar Psikologi Sosial", 2021, new Penulis[]{p5}),
            new Buku("Perkembangan Manusia", 2020, new Penulis[]{p7}),
            new Buku("Kesehatan Mental", 2022, new Penulis[]{p3})
        };

        Buku[] politik = {
            new Buku("Politik Modern", 2021, new Penulis[]{p1}),
            new Buku("Sistem Pemerintahan", 2020, new Penulis[]{p2}),
            new Buku("Ilmu Politik Dasar", 2019, new Penulis[]{p4}),
            new Buku("Hubungan Internasional", 2022, new Penulis[]{p9}),
            new Buku("Demokrasi di Dunia", 2018, new Penulis[]{p7})
        };

        Buku[] fiksi = {
            new Buku("Laut Bercerita", 2017, new Penulis[]{p10}),
            new Buku("Bumi", 2018, new Penulis[]{p6}),
            new Buku("Hujan", 2019, new Penulis[]{p5}),
            new Buku("Laskar Pelangi", 2005, new Penulis[]{p2}),
            new Buku("Pulang", 2015, new Penulis[]{p8})
        };

        Kategori k1 = new Kategori("Teknologi", teknologi);
        Kategori k2 = new Kategori("Filsafat", filsafat);
        Kategori k3 = new Kategori("Sejarah", sejarah);
        Kategori k4 = new Kategori("Agama", agama);
        Kategori k5 = new Kategori("Psikologi", psikologi);
        Kategori k6 = new Kategori("Politik", politik);
        Kategori k7 = new Kategori("Fiksi", fiksi);

        tampilkanKategori(k1);
        tampilkanKategori(k2);
        tampilkanKategori(k3);
        tampilkanKategori(k4);
        tampilkanKategori(k5);
        tampilkanKategori(k6);
        tampilkanKategori(k7);
    }


    public static void tampilkanKategori(Kategori kategori) {
        System.out.println("=== KATEGORI: " + kategori.namaKategori + " ===");

        for (int i = 0; i < kategori.daftarBuku.length; i++) {
            Buku b = kategori.daftarBuku[i];
            System.out.println("Judul       : " + b.judul);
            System.out.println("Tahun Terbit: " + b.tahunTerbit);

            System.out.print("Penulis     : ");
            for (int j = 0; j < b.penulis.length; j++) {
                System.out.print(b.penulis[j].nama);
                if (j < b.penulis.length - 1) System.out.print(", ");
            }
            System.out.println("\n");
        }
    }
}
