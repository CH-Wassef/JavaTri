// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

                Etudiant e1 = new Etudiant(1,"Attia","Imed");
                Etudiant e2 = new Etudiant(2,"wassef","chargui");
                Etudiant e3 = new Etudiant(3,"Khalil" , "Bhym");

                System.out.println(e1.equals(e2));
                System.out.println(e3);
                System.out.println(e2.equals(e2));

                GestionEtudiant g1 = new GestionEtudiant();

                g1.ajouterEtudiant(e1);
                g1.ajouterEtudiant(e2);
                g1.ajouterEtudiant(e3);

                System.out.println(g1.rechercherEtudiant(e1.getNom()));
                System.out.println(g1.getListEtudiant());

                g1.trierEtudiantsParId();
                System.out.println(g1.getListEtudiant());

                g1.trierEtudiantsParNom();
                System.out.println(g1.getListEtudiant());


                g1.supprimerEtudiant(e3);
                System.out.println(g1.getListEtudiant());






            }
        }
