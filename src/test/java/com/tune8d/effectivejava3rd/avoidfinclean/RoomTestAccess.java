package com.tune8d.effectivejava3rd.avoidfinclean;

import com.tune8d.effectivejava3rd.chapter1and2.avoidfinclean.Room;
import org.junit.Test;

public class RoomTestAccess {

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