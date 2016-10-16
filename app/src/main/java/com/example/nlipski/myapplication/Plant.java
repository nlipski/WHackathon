package com.example.nlipski.myapplication;

/**
 * Created by benji on 10/15/2016.
 */

public class Plant {
    private int id;
    private String name;
    private String imageFileName;
    private String discriptionFileName;
    private int wateramount;
    private int waterFrequencyHours;
    private int sunlight;

    public Plant(String name, String imageFN, String discFN,int wateram, int waterFqH, int tempRange) {
        this.name = name;
        imageFileName = imageFN;
        discriptionFileName = discFN;
        wateramount=wateram;
        waterFrequencyHours = waterFqH;
        this.sunlight = tempRange;
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

    public int getAmountWater(){return wateramount; }

    public int getWFqHours() {
        return waterFrequencyHours;
    }

    public int getSunlight() {
        return sunlight;
    }
}
