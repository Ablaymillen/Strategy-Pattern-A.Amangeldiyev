package com.company;

public class Venus extends Planet{
    public Venus(){
        super(new Clockwise(), new TerrestrialMass());
    }

    @Override
    public void introduce() {
        System.out.println("It's Venus");
    }
}
