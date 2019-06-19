package com.company.Lab3.Tema_Animal_Rescue;

public class Cat {
    private String name;
    private int healthState;
    private int hungerState;
    private int moodState;
    private String favoriteFood;
    private String favoriteActivity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }

    public int getHealthState() {
        return healthState;
    }

    public void setHungerState(int hungerState) {
        this.hungerState = hungerState;
    }

    public int getHungerState() {
        return hungerState;
    }

    public void setMoodState(int moodState) {
        this.moodState = moodState;
    }

    public int getMoodState() {
        return moodState;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }
}
