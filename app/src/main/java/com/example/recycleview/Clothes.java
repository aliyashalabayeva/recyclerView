package com.example.recycleview;

public class Clothes {
    int photo;
    String title;
    String size;
    int price;

    public Clothes(int photo, String title, String size, int price){
        this.photo = photo;
        this.title = title;
        this.size = size;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
