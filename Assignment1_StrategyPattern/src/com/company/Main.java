package com.company;

public class Main {

    public static void main(String[] args) {
        Planet earth = new Earth();
        earth.introduce();
        earth.performMass();
        earth.performRotation();
        Planet jupiter = new Jupiter();
        jupiter.introduce();
        jupiter.performMass();
        jupiter.performRotation();
        Planet venus = new Venus();
        venus.introduce();
        venus.performMass();
        venus.performRotation();
        Planet uranus = new Uranus();
        uranus.introduce();
        uranus.performMass();
        uranus.performRotation();
        Planet pluto = new Pluto();
        pluto.introduce();
        pluto.performMass();
        pluto.performRotation();

    }
}
