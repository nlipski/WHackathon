package com.example.nlipski.myapplication;


import java.util.ArrayList;

/**
 * Created by benji on 10/15/2016.
 */

public class UserProfile {

    private String userName;
    private ArrayList<Plant> plants;
    public UserProfile(String name) {
        userName = name;
        plants = new ArrayList<Plant>();
    }

    public void addPlant(Plant p) {
        plants.add(p);
    }

    public String getName() {
        return userName;
    }
    public Plant[] getPlants() {
        Plant[] plantsArray = new Plant[plants.size()];
        plantsArray = plants.toArray(plantsArray);
        return plantsArray;
    }
}
