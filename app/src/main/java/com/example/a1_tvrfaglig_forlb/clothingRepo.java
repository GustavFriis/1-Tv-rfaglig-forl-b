package com.example.a1_tvrfaglig_forlb;

public class clothingRepo {
    public String name;
    public int price;
    public String website;
    public boolean inStock;
    public boolean fastDelivery;

    public clothingRepo(String name, int price, String website, boolean inStock, boolean fastDelivery) {
        this.name = name;
        this.price = price;
        this.website = website;
        this.inStock = inStock;
        this.fastDelivery = fastDelivery;
    }
}
