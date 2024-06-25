package org.ss.orchestre.couplagefaible;

public class Batteur implements Musicien {
    private Instrument batterie;
    private String morceau;

    public Batteur(Instrument batterie, String morceau) {
        this.batterie = batterie;
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        batterie.afficher();
        System.out.println("et je joue le morceau " + morceau);
        batterie.jouer();
    }
}
