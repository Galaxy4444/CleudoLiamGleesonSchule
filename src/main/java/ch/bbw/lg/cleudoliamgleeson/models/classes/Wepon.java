package ch.bbw.lg.cleudoliamgleeson.models.classes;


import java.util.ArrayList;

public class Wepon {
    private String name;
    private String typ;
    private int gewicht;
    private String metrial;
    private String merkmal;

    public Wepon(String name, String typ, int gewicht, String metrial, String merkmal) {
        this.name = name;
        this.typ = typ;
        this.gewicht = gewicht;
        this.metrial = metrial;
        this.merkmal = merkmal;
    }

    public String toeten(Person person){
        person.setDead(true);
        return person.getName() + "Died";
    }

    

    public String benutzt(Person person){
        person.setDead(true);
        return person.getName() + "Died";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getMetrial() {
        return metrial;
    }

    public void setMetrial(String metrial) {
        this.metrial = metrial;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }
}
