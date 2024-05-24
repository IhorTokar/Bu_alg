package com.bu.algs.compare;

public class Human implements Comparable<Human> {

    private double height;
    private double weight;
    private int age;

    public Human(double height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        if (age > o.age) {
            return 1;
        } else if (age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
