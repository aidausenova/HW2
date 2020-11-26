package com.company;

public class Mother extends Family{

    private String close;
    private int height;

    public String getClose() {
        return close;
    }

    public int getHeight() {
        return height;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Mother(String name, int age, String close, int height) {
        super(name, age);
        this.close = close;
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("close: " + close + ", height: " + height);
    }
}
