package com.example.job;

// Mango.java
public class Mango {
    private String title;
    private String description;
    private double weight;
    private double pricePerKg;
    private int imageResource;
    private String address;

    public Mango(String title, String description, double weight, double pricePerKg, int imageResource, String address) {
        this.title = title;
        this.description = description;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
        this.imageResource = imageResource;
        this.address = address;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public double getWeight() { return weight; }
    public double getPricePerKg() { return pricePerKg; }
    public int getImageResource() { return imageResource; }
    public String getAddress() { return address; }

    public void setWeight(double weight) { this.weight = weight; }
    public double getTotalPrice() { return weight * pricePerKg; }
}
