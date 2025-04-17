import java.util.Scanner;
public class SiakadMain0102 {
public static void main(String[] args) {
    Scanner input0102 = new Scanner(System.in);
    int menu = 0;

    Mahasiswa0102[] mahasiswa = new Mahasiswa0102[3];
    
    do {
        System.out.println("====MENU SISTEM AKADEMIK====");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
        
        menu = input0102.nextInt();
        System.out.print("Pilih menu: ");
        
        switch (menu) {
            case 1:
            
            case 2:
            case 3:
            case 4:
            case 5:
            
        }
        
    } while (menu != 0);
}
    
}