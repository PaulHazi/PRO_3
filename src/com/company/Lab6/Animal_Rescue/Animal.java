package com.company.Lab6.Animal_Rescue;

public abstract class Animal {
    private String breed;
    private float hightM;
    private float weight;
    private String name;
    private int healthState;
    private int hungerState;
    private int moodState;
    private String favoriteFood;
    private String favoriteActivity;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getHightM() {
        return hightM;
    }

    public void setHightM(float hightM) {
        this.hightM = hightM;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthState() {
        return healthState;
    }

    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }

    public int getHungerState() {
        return hungerState;
    }

    public void setHungerState(int hungerState) {
        this.hungerState = hungerState;
    }

    public int getMoodState() {
        return moodState;
    }

    public void setMoodState(int moodState) {
        this.moodState = moodState;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public abstract void run();
    public abstract void sleep ();
    public abstract void smells();
}
