package Unguided_Modul02;

public class RekapNilai { 

    public static void main(String[] args) {
        // Deklarasi Konstanta KKM 
        final double KKM = 75.0;

        String[] namaMahasiswa = {"Indy", "Balqis", "Isna"};

        double[][] nilaiModul = {
            {80.0, 85.0}, // Indy
            {70.0, 65.0}, // Balqis
            {90.0, 90.0}  // Isna
        };

        // Output
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < namaMahasiswa.length; i++) {
            double modul1 = nilaiModul[i][0];
            double modul2 = nilaiModul[i][1];

            double rataRata = (modul1 + modul2) / 2;

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