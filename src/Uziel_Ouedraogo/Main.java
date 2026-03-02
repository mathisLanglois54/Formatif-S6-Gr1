package Uziel_Ouedraogo;

import Uziel_Ouedraogo.aquarium.Aquarium;
import Uziel_Ouedraogo.aquarium.Piranha;
import Uziel_Ouedraogo.aquarium.Poisson;
import Uziel_Ouedraogo.aquarium.PoissonClown;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium(5);

        Poisson p1 = new PoissonClown("Nemo", 2, "orange");
        Poisson p2 = new Piranha("Terreur", 3, "bleu");

        aquarium.ajouterPoisson(p1);
        aquarium.ajouterPoisson(p2);

        aquarium.afficherPoissons();

        System.out.println("\nLes poissons nagent :");
        aquarium.faireNagerTous();
    }
}
