public class Penilaian0102 {
    
    public double nilaiTugas;
    public double nilaiUTS;
    public double nilaiUAS;
    public double nilaiAkhir;

    public Penilaian0102(double nilaiTugas, double nilaiUTS, double nilaiUAS){
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

