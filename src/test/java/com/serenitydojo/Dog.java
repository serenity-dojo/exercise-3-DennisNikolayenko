package com.serenitydojo;

public class Dog {

    String name = "Malu";
    String favoriteToy = "Bone";
    int age = 5;

    public Dog(String name, String favoriteToy, int age) {  //why can't i make it private?
    }

    String getFavoriteToy() {return favoriteToy;}
    String getName() {return name;}
    int getAge() {return age;}
}