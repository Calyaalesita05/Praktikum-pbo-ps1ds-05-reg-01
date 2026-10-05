package project.unguided;

public class PengolahSuhu {

    public static final double NILAI_KOSONG = -1.0;

    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Menampilkan data suhu
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    // Mencari index data yang kosong
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }

        return -1;
    }

    // Mengisi data yang kosong
    public void isiDataKosong() {
        int indexKosong = cariIndexKosong();

        if (indexKosong != -1) {
            suhuHarian[indexKosong] = (suhuHarian[indexKosong - 1] + suhuHarian[indexKosong + 1]) / 2;
        }
    }

    // Menghitung rata-rata suhu
    public double hitungRataRata() {
        double total = 0;

        for (int i = 0; i < suhuHarian.length; i++) {
            total += suhuHarian[i];
        }

        return total / suhuHarian.length;
    }
}