package com.company;

public class Son extends Family{

    private int teeth;



    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public Son(int teeth,String name,int age) {
        super(name,age);
        this.teeth = teeth;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Teeth: "+teeth);
    }
}
