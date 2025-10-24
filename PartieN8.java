import java.util.*;

public class PartieN8 {
    public static void main(String [] args)
    {

        HashMap<String,Double> etudiant = new HashMap<>();
        etudiant.put("Ali", 19.5);
        etudiant.put("Sara", 9.5);
        etudiant.put("Amal", 5.0);
        for(HashMap.Entry<String,Double> entry : etudiant.entrySet())
        {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        double max=0,sum=0;
        
        for(double note : etudiant.values()){
            sum+=note;
            if(max<=note) max=note;
        }
        String nom_max="";
        for(String nom : etudiant.keySet())
        {
            if ((etudiant.get(nom))==max) nom_max= nom;
        }
        System.out.println("Meilleure note : "+ nom_max);
        System.out.printf("Moyenne générale = %.2f\n", sum/etudiant.size());
        System.out.println("Rechercher \"Ali\" : " + etudiant.get("Ali"));
    }
}
