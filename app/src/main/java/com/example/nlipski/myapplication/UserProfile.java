package com.example.nlipski.myapplication;


import java.util.ArrayList;

/**
 * Created by benji on 10/15/2016.
 */

public class UserProfile {
    private  int user_id;
    private String userName;
    private String email;
    private String passw;
    private ArrayList<Plant> plants;
    public UserProfile(String name,String uemail, String pass) {
        userName = name;
        plants = new ArrayList<Plant>();
        email=uemail;
        passw=pass;

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
