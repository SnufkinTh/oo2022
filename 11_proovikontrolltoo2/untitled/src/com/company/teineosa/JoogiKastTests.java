package com.company.teineosa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JoogiKastTests {

    @Test
    public void ArvutaMass(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        Joogipudel joogiPudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        joogiKast.getMass(14);
        double mass = joogiKast.getMass(14);
        assertEquals(738.5, mass, 0.1);
    }

    @Test
    public void ArvutaMassKuiOnRohkemKuiMahub(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        Joogipudel joogiPudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        joogiKast.getMass(14);
        double mass = joogiKast.getMass(300);
        assertEquals(738.5, mass, 0.1);
    }

    @Test
    public void villiPudelidKasti(){
        JoogiKast joogiKast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("Coca cola", 0.6, 1.4);
        Joogipudel joogiPudel = new Joogipudel(12.0, "Klaas",20.0, 0.2);
        joogiPudel.jook = jook;
        joogiKast.joogiPudel = joogiPudel;
        Joogivaat joogivaat = new Joogivaat(312, 3);
        int kogus = joogiKast.villiKastiPudelid(joogivaat);
        assertEquals(738.5, kogus, 0.1);
    }
}
