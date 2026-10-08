package project.unguided.main;

import project.unguided.model.Dataset;
import project.unguided.laporan.LaporanDataset;

public class Main {

    public static void main(String[] args) {

        // constructor tanpa parameter
        Dataset dataset1 = new Dataset();
        dataset1.setNama("Titanic");
        dataset1.setJumlahBaris(891);
        dataset1.setJumlahKolom(12);
        dataset1.setJumlahMissing(866);

        //constructor dengan satu parameter
        Dataset dataset2 = new Dataset("Wine Quality");

        // constructor lengkap
        Dataset dataset3 = new Dataset("Iris", 150, 5, 0);

        // Menyimpan objek dalam array
        Dataset[] daftarDataset = {
            dataset1,
            dataset2,
            dataset3
        };

        // Membuat objek laporan
        LaporanDataset laporan = new LaporanDataset();

        // Menampilkan laporan
        for (Dataset dataset : daftarDataset) {
            laporan.cetak(dataset);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}