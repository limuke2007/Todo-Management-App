package com.limu.kerim.IssDemo.models;

public class IssPosition {
    //{"timestamp": 1589035753, "message": "success", "iss_position": {"latitude": "-26.7182", "longitude": "-67.3130"}}
    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "IssPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
