package com.company;

public class Clockwise implements RotationStrategy{

    @Override
    public void rotation() {
        System.out.println("I rotate clockwise");
    }
}
