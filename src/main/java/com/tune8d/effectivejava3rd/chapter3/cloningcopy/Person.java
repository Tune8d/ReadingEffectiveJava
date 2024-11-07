package com.tune8d.effectivejava3rd.chapter3.cloningcopy;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    /*
    // Copy constructor

    - Deep Copy Handling: The copy constructor for Person explicitly creates a new Address object
      by calling the Address copy constructor, making it clear that a deep copy is being performed.

    - Constructor Initialization: The copy constructor allows you to utilize the class’s constructors,
      ensuring any required initialization is done properly.

    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
        this.address = new Address(other.address); // Deep copy of Address
    }
    */

    // Copy factory method
    /*
    - Descriptive Naming: The factory method (newInstance) provides a more descriptive and flexible way to create copies.
    - Flexibility: You can extend the factory to return different subclasses or modify how the copy is created
                   without affecting the external code that uses this method.
    - No Cloneable Required: We avoid the issues associated with the Cloneable interface and Object.clone().
    */

    public static Person newInstance(Person other){
        return new Person(other.name, other.age, new Address(other.address));
    }
}
