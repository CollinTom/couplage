package org.ss.orchestre.couplagefaible;

public class App {
    public static void main(String[] args) {
        System.out.println("Le pianiste : ");
        Pianiste pianiste = new Pianiste(new Piano(), "La 9eme de Beethoven");
        pianiste.jouerMorceau();

        System.out.println("Le violoniste : ");
        Violoniste violoniste = new Violoniste(new Violon(), "La 9eme de Beethoven");
        violoniste.jouerMorceau();

        System.out.println("Le batteur : ");
        Batteur batteur = new Batteur(new Batterie(), "La 9eme de Beethoven");
        batteur.jouerMorceau();

        System.out.println("L'orchestre : ");
        Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianiste);
        orchestre.ajout(violoniste);
        orchestre.ajout(batteur);
        orchestre.jouer();
    }
}
