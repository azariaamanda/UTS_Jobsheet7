public class MataKuliah0102 {
    public String kodeMK;
    public String namaMK;
    public int sks;

    public MataKuliah0102(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    public void tampil() {
        System.out.println("Kode: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
    }
}
