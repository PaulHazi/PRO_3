package com.company.Lab3.Tema_Animal_Rescue;

public class AnimalFood {
    private String name;
    private int priceDollar;
    private int quantityKg;
    private String stock;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPriceDollar(int PriceDollar) {
        this.priceDollar = PriceDollar;
    }

    public int getPriceDollar() {
        return priceDollar;
    }

    public void setQuantityKg(int QantityKg) {
        this.quantityKg = QantityKg;
    }

    public int getQuantityKg() {
        return quantityKg;
    }

    public void setStock(String Stock) {
        this.stock = Stock;
    }

    public String getStock() {
        return stock;
    }
}