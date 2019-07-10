package com.company.Lab6.Animal_Rescue;

public class  AnimalFood extends Dog {
    private String name;
    private int priceDollar;
    private int quantityKg;
    private String stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceDollar() {
        return priceDollar;
    }

    public void setPriceDollar(int PriceDollar) {
        this.priceDollar = PriceDollar;
    }

    public int getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(int QantityKg) {
        this.quantityKg = QantityKg;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String Stock) {
        this.stock = Stock;
    }

    @Override
    public void smells() {
        System.out.println("Animal food smells bad");
    }
}