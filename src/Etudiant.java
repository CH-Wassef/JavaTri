import java.time.Period;
import java.util.Comparator;

public class Etudiant implements Comparator<Etudiant> {
    private int id;
    private String nom;
    private String prenom;


    public Etudiant(int id,String nom,String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
public Etudiant(){}
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() !=obj.getClass()) return  false;
        Etudiant etd= (Etudiant) obj;
        return id ==etd.getId();
    }

    @Override
    public String toString(){
        return "Etudiant{" +
                "id=" +id +
                ", nom= '" + nom + '\''+
                ", Prenom=' "+ prenom+ '\''+
                '}';
    }

}
