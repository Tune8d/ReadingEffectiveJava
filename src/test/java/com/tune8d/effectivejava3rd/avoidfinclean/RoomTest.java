package com.tune8d.effectivejava3rd.avoidfinclean;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testAdult() {
        try(Room myRoom = new Room(7)){
            System.out.println("Goodbye");
        }
    }

    @Test
    public void testChild() {
        new Room(99);
        System.out.println("Peace out"); // no prior "cleaning room"
    }
}