package Unguided_Modul02;

public class RekapNilai { 

    public static void main(String[] args) {
        // Deklarasi Konstanta KKM 
        final double KKM = 75.0;

        // Array 1 Dimensi (String) untuk nama mahasiswa
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // Array 2 Dimensi Rectangular (double) untuk nilai Modul 1 & Modul 2
        double[][] nilaiModul = {
            {80.0, 85.0}, // Andi
            {70.0, 65.0}, // Budi
            {90.0, 90.0}  // Citra
        };

        // Output
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        // Perulangan (for) untuk memproses tiap mahasiswa
        for (int i = 0; i < namaMahasiswa.length; i++) {
            double modul1 = nilaiModul[i][0];
            double modul2 = nilaiModul[i][1];

            // Menghitung rata-rata
            double rataRata = (modul1 + modul2) / 2;

            // Percabangan (if-else) evaluasi status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Cetak Hasil
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + modul1);
            System.out.println("Nilai Modul 2 : " + modul2);
            System.out.println("Rata-rata     : " + rataRata);
            System.out.println("Status        : " + status);
            System.out.println();
        }
    }
}