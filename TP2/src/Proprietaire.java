

public class Proprietaire {
    public String nom;
    public int nbVoitures;
    public Voiture[] Voitures;
    public int jour;
    public int mois;
    public int annee;

    public Proprietaire(String pnom, int pnbVoitures, Voiture pVoitures[], int pjour, int pmois, int pannee) {
        this.nom = pnom;
        this.nbVoitures = pnbVoitures;
        this.Voitures = new Voiture[pVoitures.length];
        for (int i = 0; i < pVoitures.length; i++)
            this.Voitures[i] = pVoitures[i];
        this.jour = pjour;
        this.mois = pmois;
        this.annee = pannee;
    }

    public void associer() {
        if (this.nbVoitures != 0 && this.Voitures != null) {
            System.out.println("====== Voitures du Propriétaire ======");
            for (int i = 0; i < nbVoitures; i++) {
                System.out.println("=== Voiture " + (i+1) + " ===");
                Voitures[i].afficher();
            }
        }
        else
        {
            System.out.println("Aucune voiture à afficher");
        }
    }
}