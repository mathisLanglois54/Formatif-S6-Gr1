package etudiant04.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange du plancton et de petits crustacés près de son anémone.");
    }
}
