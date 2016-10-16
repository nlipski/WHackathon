package com.example.nlipski.myapplication;

/**
 * Created by benji on 10/15/2016.
 */

public class Plant {
    private String name;
    private String imageFileName;
    private String discriptionFileName;
    private int waterFrequencyHours;
    private int[] tempRange;

    public Plant(String name, String imageFN, String discFN, int waterFqH, int[] tempRange) {
        this.name = name;
        imageFileName = imageFN;
        discriptionFileName = discFN;
        waterFrequencyHours = waterFqH;
        this.tempRange = tempRange;
    }

    public String getName() {
        return name;
    }

    public String getIFN() {
        return imageFileName;
    }

    public String getDFN() {
        return discriptionFileName;
    }

    public int getWFqHours() {
        return waterFrequencyHours;
    }

    public int[] getTempRange() {
        return tempRange;
    }
}
