public class TestExercice_tp1
{
        public static void main(String[] args)
        {
            Etudiant firstEtudiant = new Etudiant();

//            On ne peut parceque nom et age ont une visibilité privé dans Etudiant, c à d qu'ils ne peuvent pas être ré-employé dans une autre classe
//            Solution serait de les rendre public ou d'appeler getNom() et getAge() pour les récupérer (car ce sont des getters qui survolent les restrictions de visibilité)
            System.out.println("Nom de l'etudiant: " + firstEtudiant.getNom());
            System.out.println("Age de l'etudiant: " + firstEtudiant.getAge());

            firstEtudiant.afficherEtudiant();
            firstEtudiant.saisirEtudiant();

            String nom;
            int age;
            float[] notes;

            nom = firstEtudiant.getNom();
            age = firstEtudiant.getAge();
            notes = firstEtudiant.getNotes();

            Etudiant secondEtudiant = new Etudiant(nom, age, notes);
            secondEtudiant.afficherEtudiant();


        }
}
