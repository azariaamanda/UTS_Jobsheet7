public class MataKuliah0102 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah0102(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    public void tampilMataKuliah() {
        System.out.println("Kode: " + kodeMK + " | Nama: " + namaMK + " | SKS: " + sks);
    }

    public static void sortingMK(MataKuliah0102[] mataKuliah) { //bubble sort ascending
        for (int i = 0; i < mataKuliah.length - 1; i++) {
            for (int j = 0; j < mataKuliah.length - 1; j++) {
                if (mataKuliah[j].sks > mataKuliah[j + 1].sks) {
                    MataKuliah0102 temp = mataKuliah[j];
                    mataKuliah[j] = mataKuliah[j + 1];
                    mataKuliah[j + 1] = temp;
                }
            }
        }
    }
}

    // public static void searchMK (MataKuliah0102[] mataKuliah, int cariSKS) { //sequensial search
    //     boolean ketemu = false; 
    //     for (int i = 0; i < mataKuliah.length; i++) {
    //         if (mataKuliah[i].sks == cariSKS) {
    //             mataKuliah[i].tampilMataKuliah();
    //             ketemu = true;
    //         }
    //     }
    //     if (!ketemu) {
    //         System.out.println("Mata Kuliah dengan Kode " + cariSKS + " tidak ditemukan.");
    //     }
    // }