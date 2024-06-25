package org.ss.orchestre.couplagefaible;

public class Violoniste implements Musicien {
    private Instrument violon;
    private String morceau;

    public Violoniste(Instrument violon, String morceau) {
        this.violon = violon;
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        violon.afficher();
        System.out.println("et je joue le morceau " + morceau);
        violon.jouer();
    }
}
