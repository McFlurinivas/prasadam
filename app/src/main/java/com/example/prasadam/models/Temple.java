package com.example.prasadam.models;

public class Temple {
    public Temple(String name, Address address, String mapId) {
        this.name = name;
        this.address = address;
        this.mapId = mapId;
    }


    private final String name;
    private final Address address;
    private final String mapId;
}
