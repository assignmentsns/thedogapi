package com.dogapi.model;

public class Dog {
    private double weight;
    private double height;
    private int id;
    private String name;
    private int life_span;
    private String temperament;

    public Dog(int id, String name, double height, String temperament,
               double weight, int lifeSpan) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.temperament = temperament;
        this.weight = weight;
        this.life_span = lifeSpan;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife_span() {
        return life_span;
    }

    public void setLife_span(int life_span) {
        this.life_span = life_span;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }
}
