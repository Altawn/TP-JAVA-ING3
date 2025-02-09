import java.util.Scanner;

class Etudiant { // Private, Protected, Public ?

//    Déclaration des var
    private String nom;
    private int age;
    private float[] notes;

//    Constructeur vide
    public Etudiant()
    {
        this.nom = "INCONNU";
        this.age = 20;
        this.notes = new float[0]; //this.notes = new float[]{} ?
    }

//    Constructeur à 3 paramètres
    public Etudiant(String nom, int age, float[] notes)
    {
        this.nom = nom;
        this.age = age;

        this.notes = new float[notes.length];
        for(int i = 0 ; i < notes.length ; i++)
        {
            this.notes[i] = notes[i];
        }
    }

    public void saisirEtudiant() // Private, Protected, Public ?
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Entrez le nom de l'étudiant : ");
        this.nom = in.nextLine();

        do
        {
            System.out.println("Entrez l'âge de l'étudiant (entre 18 et 25 (inclus)) : ");
            this.age = in.nextInt();
        }while(this.age < 18 || this.age > 25);

        int nbreNotes;

        do
        {
            System.out.println("Entrez le nombre de notes (entre 2 et 5 (inclus)) : ");
            nbreNotes = in.nextInt();
        }while(nbreNotes < 2 || nbreNotes > 5);

        this.notes = new float[nbreNotes];

        for(int i = 0 ; i < nbreNotes ; i++)
        {
            do
            {
                System.out.println("Entrez vos notes (entre 0 et 20 (inclus)) : ");
                this.notes[i] = in.nextFloat();
            }while(this.notes[i] < 0.0 || this.notes[i] > 20.0);
        }

        in.close(); //Askip, bonne pratique
    }

    void afficherEtudiant()
    {
        System.out.println("Nom : " + this.nom);
        System.out.println("Age : " + this.age);
        for(int i = 0 ; i < this.notes.length ; i++)
        {
            System.out.println("Note " + (i+1) + " : " + this.notes[i]);
        }
    }

    String getNom(){
        return this.nom;
    }

    int getAge(){
        return this.age;
    }

    float[] getNotes(){
        return this.notes;
    }
}

