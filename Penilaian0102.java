 class Penilaian0102 {
    Mahasiswa0102 mahasiswa;
    MataKuliah0102 mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

     Penilaian0102(Mahasiswa0102 mahasiswa, MataKuliah0102 mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public void hitungNiliaiAkhir(){
        this.nilaiAkhir = (0.3 * this.nilaiTugas) + (0.3 * this.nilaiUTS) + (0.4 * this.nilaiUAS);
    }
    public void tampil(){
        System.out.println("Nilai Tugas: "+ this.nilaiTugas);
        System.out.println("Nilai UTS: "+ this.nilaiUTS);
        System.out.println("Nilai UAS: "+this.nilaiUAS);
        System.out.println("Nilai Akhir: " +this.nilaiAkhir);
    }    
}

