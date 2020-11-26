package com.company;

public class Father extends Family{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Father(String name, int age, int weight) {
        super(name,age);
        this.weight = weight;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);
    }
}
