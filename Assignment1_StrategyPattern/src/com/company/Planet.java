package com.company;

abstract class Planet {
    private RotationStrategy rs;
    private MassStrategy ms;

    Planet(RotationStrategy rs, MassStrategy ms){
        this.rs = rs;
        this.ms = ms;
    }

    public abstract void introduce();

    public void setRts(RotationStrategy rs) {
        this.rs = rs;
    }

    public void setMs(MassStrategy ms) {
        this.ms = ms;
    }

    public void performMass(){
        this.ms.planetMass();
    }

    public void performRotation(){
        this.rs.rotation();
    }
}
