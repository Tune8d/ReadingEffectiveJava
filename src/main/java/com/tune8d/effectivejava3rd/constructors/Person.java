package com.tune8d.effectivejava3rd.constructors;

public class Person {
    private String name;
    private int age;
    private int idNumber;

    // JAVA 에서 "this()" 는 클래스 혹은 인스턴스를 통해 접근이 불가하므로 메소드 혹은 함수로 보기 어렵다.
    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this(name, 0, 0);
    }

    public Person(String name, int age) {
        this(name, age, 0);
    }

    public Person(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public void getBio(){
        System.out.println("Bio_name: " + name);
        System.out.println("Age: " + age);
    }
}
