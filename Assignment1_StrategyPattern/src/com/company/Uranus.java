package com.company;

public class Uranus extends Planet{
    public Uranus(){
        super(new Clockwise(), new GiantMass());
    }

    @Override
    public void introduce() {
        System.out.println("It's Uranus");
    }
}
