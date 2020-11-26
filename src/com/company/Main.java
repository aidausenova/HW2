package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Father").print();
        createObject("Mother").print();
        createObject("Son").print();

    }
    public static Printable createObject(String className){
        if (className == null){
            return null;
        }
        Printable  a  = null;
        switch (className){
            case "Father":
                a = new Father("Tim",45,76);
                break;
            case "Son":
                a= new Son(32,"Alex",12);
                break;
            case "Mother":
                a = new Mother("Mia",34,"dress",176);
                break;
        }

        return a;
    }
}
