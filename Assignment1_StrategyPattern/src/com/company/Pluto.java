package com.company;

public class Pluto extends Planet{
    public Pluto(){
        super(new CouterClock(), new DwarfMass());
    }


    @Override
    public void introduce() {
        System.out.println("This is Pluto");
    }
}
