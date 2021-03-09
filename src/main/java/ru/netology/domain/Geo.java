package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private GeoMap geoMap;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public GeoMap getGeoMap() {
        return geoMap;
    }

    public void setGeoMap(GeoMap geoMap) {
        this.geoMap = geoMap;
    }
}
