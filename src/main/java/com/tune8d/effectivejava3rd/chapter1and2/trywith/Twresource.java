package com.tune8d.effectivejava3rd.chapter1and2.trywith;

public class Twresource {
    public static void main(String[] args) {
        /*
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
            String line;
        } // Automatically closes te resource when the try block ends
        */
        System.out.println("Hello World");
    }
}
