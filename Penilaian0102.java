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

    public static void sortingDSC(Penilaian0102[]data){
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length -1; j++) {
               if (data[j].nilaiAkhir < data [j+1].nilaiAkhir) {
                    Penilaian0102 temp = data [j];
                    data [j] = data [j+1];
                    data [j+1] = temp;
               } 
            }
        }
    }
}

