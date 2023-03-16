package com.logs.logs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Person {
    @Id @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    private int age;

    private String title;
    private String hometown;

    Person() {}

    Person(String name, int age, String title, String hometown) {

        this.name = name;
        this.age = age;
        this.title = title;
        this.hometown = hometown;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}