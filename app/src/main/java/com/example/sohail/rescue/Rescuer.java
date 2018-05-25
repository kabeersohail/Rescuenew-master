package com.example.sohail.rescue;

public class Rescuer {
    double latitude,longitude;
    String name,uid;

    public Rescuer(){

    }

    public Rescuer(double latitude, double longitude, String name,String uid) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double logitude) {
        this.longitude = logitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
