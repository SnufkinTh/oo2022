package com.company.teineosa;

public class Joogipudel {
    double maht;
    String pudeliTyyp;
    double mass;
    double taaraMaksmus;
    Jook jook;

    public Joogipudel(double maht, String pudeliTyyp, double mass, double taaraMaksmus) {
        this.maht = maht;
        this.pudeliTyyp = pudeliTyyp;
        this.mass = mass;
        this.taaraMaksmus = taaraMaksmus;
        this.jook = jook;
    }

    public double getMass() {
        if (jook == null){
            return mass;
        } else {
            return mass + jook.erikaal;
        }
    }
    public double getKoguhind(){
        if (jook == null){
            return taaraMaksmus;
        } else {
            return taaraMaksmus + jook.erikaal* jook.omahind;
        }
    }
}

