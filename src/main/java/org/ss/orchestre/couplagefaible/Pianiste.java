package org.ss.orchestre.couplagefaible;

public class Pianiste implements Musicien {
    private Instrument piano;
    private String morceau;

    public Pianiste(Instrument piano, String morceau) {
        this.piano = piano;
        this.morceau = morceau;
    }

    public void jouerMorceau() {
        piano.afficher();
        System.out.println("et je joue le morceau " + morceau);
        piano.jouer();
    }
}
