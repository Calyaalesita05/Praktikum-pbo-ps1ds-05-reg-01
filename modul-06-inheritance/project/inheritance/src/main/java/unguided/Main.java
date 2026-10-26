package unguided;

public class Main {
    public static void main(String[] args) {
        ModelUmum[] daftarModel = {
            new ModelRegresi("Regresi Linier", 500, 4),
            new ModelKlasifikasi("Decision Tree", 800, 3),
            new ModelDeepLearning("Neural Network", 1000, 5, 3)
        };

        int totalBiaya = 0;

        for (ModelUmum model : daftarModel) {
            model.tampilkanInformasi();

            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");

            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        ModelUmum neuralNetwork = daftarModel[2];
        ModelUmum regresiLinier = daftarModel[0];

        System.out.println("Biaya 10 epoch (Neural Network): "
                + neuralNetwork.hitungBiaya(10));

        System.out.println("Biaya 10 epoch (Regresi Linier): "
                + regresiLinier.hitungBiaya(10));

        ModelRegresi regresi = (ModelRegresi) daftarModel[0];

        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): "
                + regresi.hitungBiaya(10, 50));
    }
}