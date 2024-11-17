package com.neo_api.NeoApi.model;

public class Page {

    private String size;
    private String total_pages;
    private String number;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Page{" +
                "size='" + size + '\'' +
                ", total_pages='" + total_pages + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
