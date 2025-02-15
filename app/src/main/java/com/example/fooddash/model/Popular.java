package com.example.fooddash.model;

public class Popular {

    public Popular(String name,String price,String rating,String deliveryTime,String deliveryCharges,String note, String imageUrl)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.deliveryCharges = deliveryCharges;
        this.note = note;
        this.imageUrl = imageUrl;
    }

    private String name;
    private String rating;
    private String deliveryTime;
    private String deliveryCharges;
    private String price;
    private String note;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(String deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}

