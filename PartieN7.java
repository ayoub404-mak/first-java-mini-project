import java.util.*;
public interface PartieN7 {
    public static void main(){
        Set<String> nom = new HashSet<>();
        nom.add("Ali");
        nom.add("Sara");
        nom.add("Youssf");
        nom.add("Amal");
        nom.add("Hicham");
        System.out.println(nom);
        System.out.println("taille : "+nom.size());

        System.out.println("recherch \"Sara\" : " +
        ( (nom.contains("Sara")) ?
         "existe" : "not existe" )); 
         nom.add("karim");
         
        System.out.println("Après ajout \"Karim\" :"+nom);
        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> B = new HashSet<>(Arrays.asList(3,4,5,6));
        Set<Integer> U = new HashSet<>(A);
        Set<Integer> I = new HashSet<>(A);
        Set<Integer> D = new HashSet<>(A);
        U.addAll(B);
        I.retainAll(B);
        D.removeAll(B);
        System.out.println("Set A : "+A);
        System.out.println("Set B : "+B);
        System.out.println("Union : "+U);
        System.out.println("Intersection : "+I);
        System.out.println("Différence (A-B) : "+D);


    }
}