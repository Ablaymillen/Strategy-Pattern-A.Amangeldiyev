package com.company;

public class Jupiter extends Planet{
    public Jupiter(){
        super(new CouterClock(), new GiantMass());
    }

    @Override
    public void introduce() {
        System.out.println("It's Jupiter");
    }
}
