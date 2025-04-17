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
}