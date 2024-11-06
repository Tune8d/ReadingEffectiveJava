package com.tune8d.effectivejava3rd.methodpractice;

import java.util.Objects;

public class Person implements Cloneable, Comparable<Person> {
    private final String name;
    private final int age;
    private final String email;
    private int hashCode;

    public Person(String name, int age, String email) {
        this.name = Objects.requireNonNull(name);
        this.age = age;
        this.email = Objects.requireNonNull(email);
    }

    // Item 10: Obey the general contract when overriding equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Reflexivity
        if (o == null || getClass() != o.getClass()) return false; // Consistent class type
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && email.equals(person.email); // Symmetry & Consistency
    }

    // Item 11: Always override hashCode when you override equals
    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = name.hashCode();
            result = 31 * result + Integer.hashCode(age); // Integer.hashCode is safer for primitives
            result = 31 * result + (email != null ? email.hashCode() : 0); // Handle nullable fields
            return result;
        }
        return result; // Ensures consistency with equals
    }

    // Item 12: Always override toString
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }

    // Item 13: Override clone judiciously
    @Override
    protected Person clone() {
        try {
            return (Person) super.clone(); // Safe because of Cloneable implementation
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Shouldn't happen because we're Cloneable
        }
    }

    // Item 14: Consider implementing Comparable
    @Override
    public int compareTo(Person other) {
        int nameCompare = name.compareTo(other.name);
        if (nameCompare != 0) return nameCompare;
        int emailCompare = email.compareTo(other.email);
        return emailCompare != 0 ? emailCompare : Integer.compare(age, other.age); // Consistent, natural ordering
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30, "alice@example.com");
        Person p2 = new Person("Alice", 30, "alice@example.com");
        Person p3 = p1.clone();

        System.out.println(p1.equals(p2)); // true, meets equals contract
        System.out.println(p1.hashCode() == p2.hashCode()); // true, consistent with equals
        System.out.println(p1); // toString output
        System.out.println(p1.compareTo(p2)); // 0, natural ordering
    }
}
