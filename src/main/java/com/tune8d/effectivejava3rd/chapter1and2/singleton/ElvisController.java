package com.tune8d.effectivejava3rd.chapter1and2.singleton;

public class ElvisController {
    public static void main(String[] args) {

        // Enum, by its nature, guarantees a single instance.
        Elvis.INSTANCE.leaveTheBuilding();

    }
}
