package com.example.a1_tvrfaglig_forlb;

import android.annotation.SuppressLint;

import java.util.ArrayList;

public class repoClothingData {
    public String name;
    public String brand;
    public double price;
    public boolean FastDelivery;
    public boolean inStock;
    public boolean used;



    public repoClothingData(String name, String brand, double price, boolean FastDelivery, boolean inStock, boolean used) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.FastDelivery = FastDelivery;
        this.inStock = inStock;
        this.used = used;
    }
    public ArrayList<repoClothingData> clothingList;
    repoClothingData shoesAir1s = new repoClothingData("Air force 1s","Nike",900.00,true,true,true);
    repoClothingData shoesJordans = new repoClothingData("Jordans panda low","Nike",2500.00,true,true,false);
    repoClothingData shoesVans = new repoClothingData("Slipon white","Vans",400.00,true,true,false);
    repoClothingData shoesMartens = new repoClothingData("Dr. Martens","Dr. Martens",950.00,false,true,false);
    repoClothingData tShirtWhite = new repoClothingData("Supreme","Supreme",1103.00,true,false,false);
    repoClothingData tShirtBlack = new repoClothingData("Black t-shirt","Carhartt",300.00,true,true,false);
    repoClothingData tShirtRainbow = new repoClothingData("Multicolored t-shirt","Adidas",400.00,true,true,false);
    repoClothingData tShirtGrey = new repoClothingData("Grey t-shirt","Gucci",800.00,true,false,false);
    repoClothingData hoodieBape = new repoClothingData("Bape sipper hoodie purple","Bape",2000.00,false,false,false);
    repoClothingData hoodieSupreme = new repoClothingData("Supreme white","Supreme",1300.00,true,true,true);
    repoClothingData hoodieCarhartt = new repoClothingData("Grey hoodie","Carhartt",800.00,true,true,false);
    repoClothingData hoodieNike = new repoClothingData("White sweat hoodie","Nike",600.00,true,true,false);
    repoClothingData pantsCargo = new repoClothingData("Black cargo pants","Bershka",640.00,true,false,false);
    repoClothingData pantsSweatpants = new repoClothingData("Gret sweatpants","Nike",600.00,true,true,false);
    repoClothingData pantsShorts = new repoClothingData("Gucci Short","Gucci",1000.00,true,true,false);
    repoClothingData pantsSuit = new repoClothingData("Suit pants","Gucci",2000.00,true,true,false);
    repoClothingData beaniePink = new repoClothingData("Pink beanie","Adidas",300.00,true,true,false);
    repoClothingData beanieBlue = new repoClothingData("Blue beanie","Adidas",300.00,true,true,false);
    repoClothingData beanieBlack = new repoClothingData("Black beanie","Nike",250.00,true,true,false);
    repoClothingData beanieWhite = new repoClothingData("White beanie","Nike",250.00,true,true,false);
    repoClothingData jacketBomber = new repoClothingData("Bomber jacket","Bershka",300.00,false,false,false);
    repoClothingData jacketDenim = new repoClothingData("Denim jacket","Tommy Hilfiger",700.00,true,true,false);
    repoClothingData jacketWinter = new repoClothingData("Winter jacket","Fjallraven",2899.00,true,true,false);
    repoClothingData jacketRain = new repoClothingData("Rain jacket green","Gucci",3500.00,true,true,false);

    public repoClothingData() {
        //clothingList = new ArrayList<repoClothingData>();

            clothingList.add(shoesAir1s);
            clothingList.add(shoesJordans);
            clothingList.add(shoesMartens);
            clothingList.add(shoesVans);
            clothingList.add(tShirtWhite);
            clothingList.add(tShirtBlack);
            clothingList.add(tShirtRainbow);
            clothingList.add(tShirtGrey);
            clothingList.add(hoodieBape);
            clothingList.add(hoodieSupreme);
            clothingList.add(hoodieCarhartt);
            clothingList.add(hoodieNike);
            clothingList.add(pantsCargo);
            clothingList.add(pantsShorts);
            clothingList.add(pantsSuit);
            clothingList.add(pantsSweatpants);
            clothingList.add(beanieBlue);
            clothingList.add(beanieWhite);
            clothingList.add(beanieBlack);
            clothingList.add(beaniePink);
            clothingList.add(jacketBomber);
            clothingList.add(jacketRain);
            clothingList.add(jacketDenim);
            clothingList.add(jacketWinter);
        }
}
