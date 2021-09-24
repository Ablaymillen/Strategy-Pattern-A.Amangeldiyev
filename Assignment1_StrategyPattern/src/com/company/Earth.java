package com.company;

public class Earth extends Planet{
    public Earth(){
        super(new CouterClock(), new TerrestrialMass());
    }

    @Override
    public void introduce() {
        System.out.println("This is Earth");
    }
}
