package com.example.mylife;

public class putpdf {
    public String name;
    public String url;

    public putpdf() {
    }

    public putpdf(String name,String url) {
        this.url = url;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
