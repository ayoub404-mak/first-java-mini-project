import java.util.*;
public class PartieN5 {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);
        char [] tab ;
        String tex;

        System.out.print("Entrez une chaine : ");
        tex=scanner.nextLine();
        tab= tex.toCharArray();
        System.out.println("Longeur : "+tab.length);
        System.out.println("Premier caractère : "+tab[0]);
        System.out.println("Dernier caractère : "+tab[tab.length-1]);
        System.out.println("Majuscules : " +tex.toUpperCase());
        char [] pol=new char[tab.length];
        int j=tab.length-1;
        for(char i: tab)
        pol[j--]=i;
        if(Arrays.equals(tab, pol)) System.out.println("La chaîne est un palindrome");
        else System.out.println("La chaîne n´est pas un palindrome");
        scanner.close();
    }
}
