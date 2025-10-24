import java.util.*;
public class PartieN10 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre d’étudiants : ");
        int N=scanner.nextInt();
        scanner.nextLine();
        HashMap<String,Double> note = new HashMap<>();
        for(int i=1 ; i<=N;i++){
            System.out.print("nom de "+i+" etudent: ");
            String a=scanner.nextLine();
            System.out.print("note de "+i+" etudent: ");
            double b=scanner.nextDouble();
            scanner.nextLine();
            note.put(a, b);

        }
        System.out.println("Nombre d'étudiants : "+N);            
        moyenne(note);
        top_bottom_note(note);
        scanner.close();

    }


    static void moyenne(Map<String, Double> notes){
        double sum =0;
        for(double not: notes.values())
        sum=sum+not;

        System.out.println("la liste comlete: ");
        for(Map.Entry<String,Double> entry : notes.entrySet())
        System.out.println(entry.getKey()+"-->"+entry.getValue()+" ");
        System.out.printf("Moyenne : %.2f\n",sum/notes.size());

    }

    static void top_bottom_note(HashMap<String,Double> etudiant)
    {
        double max=0;
        double min =20;
        
        for(double note : etudiant.values()){
            if(max<=note) max=note;
            else if (min>=note) min=note;
        }
        String nom_max="";
        String nom_min="";
        for(String nom : etudiant.keySet())
        {
            if ((etudiant.get(nom))==max) nom_max= nom;
            else if ((etudiant.get(nom))==min) nom_min= nom;
        }
        System.out.println("Meilleure note est de  : ("+ nom_max+") "+max);
        System.out.println("faible note est de : ("+ nom_min+") "+min);


        System.out.println("Rechercher \"Yassine\" : " + 
        (
            (etudiant.containsKey("Yassine") ? "Yassine existe " : "Yassine n’existe pas")
            )
            );
    
    }
}
