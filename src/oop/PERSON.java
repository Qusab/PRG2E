package oop;

import java.util.Objects;

public class PERSON {
    int weight;
    int age;
    String name;
    String sex;
    int lastDays;

    public PERSON(int weight, int age, String name, String sex, int lastDays) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.lastDays = lastDays;
    }


    public boolean can_donate() {
        if (sex.equals("M")) {
            return age >= 18 && age <= 65 && weight >= 50 && weight <= 185 && lastDays >= 90;
        }
        if (sex.equals("Z")) {
            return age >= 18 && age <= 65 && weight >= 50 && weight <= 185 && lastDays >= 120;
        }
        return false;
    }
}
