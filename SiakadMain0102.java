import java.util.Scanner;
public class SiakadMain0102 {
    public static void main(String[] args) {
    Scanner input0102 = new Scanner(System.in);
    int menu = 0;

    Mahasiswa0102[] mahasiswa = {
        new Mahasiswa0102("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa0102("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa0102("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
    };

    MataKuliah0102[] mataKuliah = {
        new MataKuliah0102("MK001", "Struktur Data", 3),
        new MataKuliah0102("MK002", "Basis Data", 3),
        new MataKuliah0102("MK003", "Desain Web", 3),
    };

    Penilaian0102[] penilaian = {
        new Penilaian0102(mahasiswa[0], mataKuliah[0], 80, 85, 90),
        new Penilaian0102(mahasiswa[0], mataKuliah[0], 60, 75, 70),
        new Penilaian0102(mahasiswa[1], mataKuliah[1], 75, 70, 80),    
        new Penilaian0102(mahasiswa[2], mataKuliah[2], 85, 90, 95),
        new Penilaian0102(mahasiswa[2], mataKuliah[2], 80, 90, 65),
    };
    
    do {
        System.out.println("====MENU SISTEM AKADEMIK====");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
        
        System.out.print("Pilih menu: ");
        menu = input0102.nextInt();
        
        switch (menu) {
            case 1:
                for (Mahasiswa0102 mhs : mahasiswa) {
                    mhs.tampilMahasiswa();
                }
                break;
            case 2:
                for (MataKuliah0102 mk : mataKuliah) {
                    mk.tampilMataKuliah();
                }
                break;
            case 3:
                for (Penilaian0102 p : penilaian) {
                    p.hitungNiliaiAkhir();
                    System.out.println("Mahasiswa: " + p.mahasiswa.nama + " | Mata Kuliah: " + p.mataKuliah.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
                }
                break;
            case 4:
                System.out.println("Urutkan Mahasiswa berdasarkan Nilai Akhir:");
                for (int i =0; i< penilaian.length; i++){
                    penilaian[i].hitungNiliaiAkhir();
                } 
                    Penilaian0102.sortingDSC(penilaian);
                    for (Penilaian0102 p : penilaian){
                        System.out.println("Mahasiswa: " + p.mahasiswa.nama + " | Mata Kuliah: " + p.mataKuliah.namaMK + " | Nilai Akhir: " + p.nilaiAkhir);
                    }
            case 5:
                System.out.print("Masukkan Mahasiswa NIM yang dicari: ");
                String cari = input0102.next();
                Mahasiswa0102.SearchNim(mahasiswa, cari);
                break;  
            case 0:
                System.out.println("Keluar dari Program.");
                break;
            default:
                System.out.println("Menu tidak valid. Silakan coba lagi.");
                break;
        }
        
    } while (menu != 0);
}
}