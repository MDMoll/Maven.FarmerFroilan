package com.zipcodewilmington.froilansfarm;

public interface Botanist {

    void plant(Crop crop, CropRow rowNumber);

    void harvest(CropRow rowNumber);

}
