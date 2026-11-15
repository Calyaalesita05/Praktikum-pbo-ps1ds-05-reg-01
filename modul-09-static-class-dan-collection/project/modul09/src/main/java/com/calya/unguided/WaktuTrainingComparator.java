package com.calya.unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<ModelEksperimen> {

    @Override
    public int compare(ModelEksperimen model1, ModelEksperimen model2) {
        return Integer.compare(
                model1.getWaktuTraining(),
                model2.getWaktuTraining()
        );
    }
}