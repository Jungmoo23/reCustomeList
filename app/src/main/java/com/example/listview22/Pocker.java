package com.example.listview22;

public class Pocker {

    private String name;
    private String work;
    private String image;

    public Pocker(String name, String work, String image){
        this.image = image;
        this.name = name;
        this.work = work;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public String getName() {
        return name;
    }
}
