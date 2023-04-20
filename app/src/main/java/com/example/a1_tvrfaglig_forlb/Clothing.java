package com.example.a1_tvrfaglig_forlb;

public class Clothing {
        private String name;
        private int price;
        private String website;

        private int imageWebsite;
        private boolean inStock;
        private boolean fastDelivery;


    public Clothing (String name, int price, String website, int imageWebsite, boolean inStock, boolean fastDelivery) {
            this.name = name;
            this.price = price;
            this.website = website;
            this.inStock = inStock;
            this.fastDelivery = fastDelivery;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public int getImageWebsite() {
            return imageWebsite;
        }

        public void setImageWebsite(int imageWebsite) {
        this.imageWebsite = imageWebsite;
        }

        public boolean isInStock() {
            return inStock;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }

        public boolean isFastDelivery() {
            return fastDelivery;
        }

        public void setFastDelivery(boolean fastDelivery) {
            this.fastDelivery = fastDelivery;
        }

}
