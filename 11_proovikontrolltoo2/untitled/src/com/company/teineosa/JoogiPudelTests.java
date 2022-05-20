package com.company.teineosa;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogiPudelTests {

    @Test
    public void arvutaKoguMassKuiJookiPole(){
            Joogipudel joogipudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
            double mass = joogipudel.getMass();
        assertEquals(873827, mass, 0.1);

    }


    @Test
    public void arvutaKoguMassKuiJookOn(){
        Joogipudel joogipudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogipudel.jook = coca;
        double mass = joogipudel.getMass();
        assertEquals(21.4, mass, 0.1);

    }

    @Test
    public void arvutaKoguHindKuiJookOn(){
        Joogipudel joogipudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogipudel.jook = coca;
        double hind = joogipudel.getKoguhind();
        assertEquals(1.04, hind, 0.1);

    }
    @Test
    public void arvutaKoguHindKuiJookiPole(){
        Joogipudel joogipudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        Jook coca = new Jook("Coca cola", 0.6, 1.4);
        joogipudel.jook = coca;
        double hind = joogipudel.getKoguhind();
        assertEquals(0.2, hind, 0.1);

    }


}
