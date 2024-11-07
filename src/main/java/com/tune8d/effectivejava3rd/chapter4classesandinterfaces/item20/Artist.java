package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item20;

import java.util.Arrays;

// Artist class that implements Singer, Songwriter, and Comparable interfaces
public class Artist implements Singer, Songwriter, Comparable<Artist> {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(name + " is singing a song...");
    }

    @Override
    public String writeSong() {
        // Example song content based on artist's name length
        return "Composing a new song by " + name + "...";
    }

    // Implementing the compareTo method for natural ordering of Artist instances
    @Override
    public int compareTo(Artist other) {
        // Comparing based on the length of the song (in this case, the song string length)
        return Integer.compare(this.writeSong().length(), other.writeSong().length());
    }

    public static void main(String[] args) {
        Artist artist1 = new Artist("Alice");
        Artist artist2 = new Artist("Bob");

        // Using compareTo to determine order
        int comparison = artist1.compareTo(artist2);

        if (comparison < 0) {
            System.out.println(artist1.name + " writes a shorter song than " + artist2.name);
        } else if (comparison > 0) {
            System.out.println(artist1.name + " writes a longer song than " + artist2.name);
        } else {
            System.out.println(artist1.name + " and " + artist2.name + " write songs of the same length");
        }

        //Example sorting of artists
        Artist[] artists = {artist1, artist2, new Artist("Charlie")};
        Arrays.sort(artists);
        for (Artist artist : artists) {
            System.out.println("Sorted artist: " + artist.name);
        }

    }
}