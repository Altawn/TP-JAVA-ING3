import java.util.*;

public class Voiture
{
    private String marque;
    private String modele;
    private int annee;

    public Voiture(String pmarque, String pmodele, int pannee)
    {
        this.marque = pmarque;
        this.modele = pmodele;
        this.annee = pannee;
    }

    public static Voiture saisir(Scanner clavier)
    {
        System.out.println("==============================");
        System.out.println("====== Nouvelle Voiture ======");
        System.out.println("Saisir la marque de la voiture : ");
        String marque = clavier.nextLine();

        System.out.println("Saisir le modèle de la voiture : ");
        String modele = clavier.nextLine();

        System.out.println("Saisir l'année de la voiture : ");
        int annee = clavier.nextInt();
        clavier.nextLine();

        return new Voiture(marque, modele, annee);
    }

    public void afficher()
    {
        System.out.println("Marque : " + this.marque);
        System.out.println("Modele : " + this.modele);
        System.out.println("Annee : " + this.annee);
    }

}