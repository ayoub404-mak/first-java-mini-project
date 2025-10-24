import java.util.*;
public class PartieN1{
    public static void main(String [] agrs){
        Scanner scanner = new Scanner (System.in);
// PARTIE I
        System.out.print("Entrez un entier : ");
        int a=scanner.nextInt();
        System.out.print("Entrez un reel : ");
        double b=scanner.nextDouble();
        System.out.print("Entrez un Caracters : ");
        scanner.nextLine();
        String c=scanner.nextLine();

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        
        System.out.print("entrez deux entiers :");
        int nbr1=scanner.nextInt();
        int nbr2=scanner.nextInt();

        System.out.println("somme= "+(nbr1+nbr2));
        System.out.println("moyenne= "+(nbr1+nbr2)/2);
        System.out.println("Reste = "+(nbr1%nbr2));

        scanner.close();
    }
}