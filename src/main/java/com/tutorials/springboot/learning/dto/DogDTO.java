package com.tutorials.springboot.learning.dto;

public class DogDTO {
    private int id;
    private String breed;
    private int age;
    private String color;

    public DogDTO() {
    }

    public DogDTO(int id, String breed, int age, String color) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
