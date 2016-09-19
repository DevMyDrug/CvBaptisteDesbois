package com.example.baptiste.cvbaptistedesbois;

import android.graphics.drawable.Drawable;

import java.util.Date;

/**
 * Created by Baptiste on 29/06/2016.
 */
public class ObjectList {
    String title;
    String describ;
    String Date;
    String City;
    int drId;

    public ObjectList(String title, String describ, String date, int dr) {
        this.title = title;
        this.describ = describ;
        Date = date;
        this.drId = dr;
    }

    public ObjectList(String title, String describ, String date, String city) {
        this.title = title;
        this.describ = describ;
        Date = date;
        City = city;
    }

    public ObjectList(String title, String describ, String date) {
        this.title = title;
        this.describ = describ;
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getDr() {
        return drId;
    }
}
