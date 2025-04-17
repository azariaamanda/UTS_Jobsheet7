public class Mahasiswa0102 {
    public String nim;
    public String nama;
    public String prodi;

    Mahasiswa0102(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa() {
        System.out.println("====Daftar Mahasiswa====");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

    }

    public static  void SearchNim (Mahasiswa0102[] mahasiswa, String cari) {
        boolean ketemu = false;
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].nim.equalsIgnoreCase(cari)) {
                mahasiswa[i].tampilMahasiswa();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
        }
    }
}