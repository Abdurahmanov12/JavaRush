package com.example.javarush;

public class Model {
    private int id;
    private String title;
    private String description;
    private String date;
    private String url;
    private int asd;

    public Model(int id, String title, String description, String date,int asd) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        //this.url = url;
        this.asd = asd;
    }

    public int getAsd() {
        return asd;
    }

    public void setAsd(int asd) {
        this.asd = asd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }


}
