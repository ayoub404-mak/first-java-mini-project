import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PartieN9 {
    public static void main (String [] args){
        ArrayList<Integer> lis = new ArrayList<>(Arrays.asList(1,2,3,4));
        HashMap <String,Double> note = new HashMap<>();
        note.put("Ali", 12.5);
        note.put("Sara", 15.5);
        note.put("Amal", 8.0);
        
        


        somme(lis);
        estPalindrome();
        moyenne(note);

        
    }

    static void somme(ArrayList<Integer> list){
        int som=0;
        System.out.println("Liste : "+list);
        for(int i=0;i<list.size();i++){
            som=som+list.get(i);
        }

        System.out.println("la somme est : "+som);
    }

    static void estPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("mot : ");
        String mot=scanner.nextLine();
        String invmot= new StringBuilder(mot).reverse().toString();
        System.out.println("Palindrome : "+((mot.equals(invmot)) ? "vrai" : "faux"));
        scanner.close();
    }

    static void moyenne(Map<String, Double> notes){
        double sum =0;
        for(double not: notes.values())
        sum=sum+not;

        System.out.print("notes : { ");
        for(Map.Entry<String,Double> entry : notes.entrySet())
        System.out.print(entry.getKey()+"="+entry.getValue()+" ");
        System.out.println(" }");
        System.out.printf("Moyenne : %.2f",sum/notes.size());

    }

}
