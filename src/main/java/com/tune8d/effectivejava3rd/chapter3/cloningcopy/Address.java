package com.tune8d.effectivejava3rd.chapter3.cloningcopy;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    //Copy constructor
    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
    }


}
