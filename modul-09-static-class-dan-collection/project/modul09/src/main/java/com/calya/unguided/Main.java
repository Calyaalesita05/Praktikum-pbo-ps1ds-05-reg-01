package com.calya.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ModelEksperimen> daftarModel = new ArrayList<>();

        daftarModel.add(new ModelEksperimen("Logistic Regression", 0.82, 12));
        daftarModel.add(new ModelEksperimen("Random Forest", 0.91, 45));
        daftarModel.add(new ModelEksperimen("SVM", 0.87, 60));
        daftarModel.add(new ModelEksperimen("KNN", 0.79, 5));
        daftarModel.add(new ModelEksperimen("Decision Tree", 0.84, 8));

        // Menampilkan jumlah eksperimen
        System.out.println("Jumlah eksperimen: "
                + ModelEksperimen.getJumlahEksperimen());

        // Sorting berdasarkan akurasi
        Collections.sort(daftarModel);

        System.out.println("\nSorted by akurasi");
        daftarModel.forEach(System.out::println);

        // Sorting berdasarkan waktu training
        Collections.sort(daftarModel, new WaktuTrainingComparator());

        System.out.println("\nSorted by waktu training");
        daftarModel.forEach(System.out::println);

        // Filtering model dengan akurasi minimal 0.85
        System.out.println("\nModel dengan akurasi minimal 0.85");

        daftarModel.stream()
                .filter(model -> model.getAkurasi() >= 0.85)
                .forEach(System.out::println);

        // Pencarian model KNN
        System.out.println("\nPencarian model KNN");

        ModelEksperimen hasil = daftarModel.stream()
                .filter(model -> model.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);

        System.out.println(hasil);
    }
}
