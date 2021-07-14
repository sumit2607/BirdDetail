package com.example.recyclerview;

public class Database {
    private String name;
    private int  id;
    private String DOB;
    private String address;
    private int Image;

    public Database(String name,int id,String DOB,String address,int image) {
        this.name = name;
        this.id= id;
        this.DOB=DOB;
        this.address =address;
        this.Image=image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public int getImage() {
        return Image;
    }
}
