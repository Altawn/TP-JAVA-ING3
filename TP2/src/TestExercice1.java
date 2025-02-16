import java.util.*;

public class TestExercice1
{
    public static void main(String args[])
    {
        Scanner clavier = new Scanner(System.in);
        String nom_proprio = " ";
        int nb_voitures = 0;
        int annee_proprio = 0;
        int mois_proprio = 0;
        int jour_proprio = 0;

//        Saisir un nom de propriétaire, son nombre de voitures (vérifier par une boucle qu’il est positif ou nul) et
//        sa date de naissance (jour/mois/année 3 int). Saisir le nombre de voitures du propriétaire en vérifiant par
//        une boucle que ce nombre est positif.

        System.out.println("Saisir un nom de propriétaire : ");
        nom_proprio = clavier.nextLine();

        do
        {
            System.out.println("Saisir son nombre de voitures : ");
            nb_voitures = clavier.nextInt();
        }while(nb_voitures <= 0);

        System.out.println("Saisir son année de naissance : ");
        annee_proprio = clavier.nextInt();

        System.out.println("Saisir son mois de naissance  : ");
        mois_proprio = clavier.nextInt();

        System.out.println("Saisir son jour de naissance  : ");
        jour_proprio = clavier.nextInt();

        clavier.nextLine();
//        Pour chaque voiture du tableau du propriétaire, saisir la marque, le modèle et l’année de fabrication d’une
//        voiture puis instancier un objet de la classe Voiture avec ces valeurs saisies.

        Voiture[] voitures = new Voiture[nb_voitures];

        for(int i = 0 ; i < nb_voitures ; i++)
        {
            voitures[i] = Voiture.saisir(clavier);
        }

//        Pour l’objet de la classe Proprietaire, instancier un objet de cette classe avec toutes les informations en
//        paramètres.

        Proprietaire premier = new Proprietaire(nom_proprio, nb_voitures, voitures, jour_proprio, mois_proprio, annee_proprio);
        premier.associer();

        clavier.close();

    }
}
