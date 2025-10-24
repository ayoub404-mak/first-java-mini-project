import java.util.*;
public class PartieN3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Entrez un entier pour la table : ");
        int a = scanner.nextInt();
        for(int i=1; i<=10;i++)
        System.out.println(a+" x "+i+" = "+a*i);

         System.out.print("Entrez N : ");
        int k=scanner.nextInt();
        int s=0;
        for(int i=1;i<=k;i++)
            s=s+i;
        System.out.println("Somme des "+k+" premiers entiers = "+s);
        

        System.out.print("Entrez un entier : ");
        int z = scanner.nextInt();
        boolean pre=false;
        if(z==1 || z==2  ) System.out.println(z+" est un nombre premier");
        else if(z==0) System.out.println(" n`est pas un nombre premier");
        else{
        for(int i=2 ; i<=Math.sqrt(z); i++)
            {if(z%i==0) 
                {pre=true;break;}
            }
        System.out.println((pre) ? z+" n`est pas un nombre premier" : z+" est un nombre premier");
        }
        scanner.close();
    }
}
