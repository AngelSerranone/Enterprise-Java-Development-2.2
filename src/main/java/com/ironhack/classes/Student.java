package com.ironhack.classes;

/** Exercise 3: Create a Student class to represent the students in your course.
 * Add all relevant properties and behaviors that you might need. Don't forget to add getters and setters.*/

public class Student {
    // Properties
    private String name;
    private String lastName;
    private int age;
    private String email;
    private Boolean onLine;

    // Constructor
    public Student(String name, String lastName, int age, String email, Boolean onLine) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setEmail(email);
        setOnLine(onLine);
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getOnLine() {
        return onLine;
    }

    public void setOnLine(Boolean onLine) {
        this.onLine = onLine;
    }
}
