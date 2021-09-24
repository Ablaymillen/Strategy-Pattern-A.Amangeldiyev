package com.company;

public class CouterClock implements RotationStrategy{

    @Override
    public void rotation() {
        System.out.println("I rotate counter-clockwise");
    }
}
