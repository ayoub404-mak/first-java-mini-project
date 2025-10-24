import java.util.*;
public class PartieN2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Entrez un entier : ");
        int a=scanner.nextInt();
        System.out.println((a%2==0) ? a+" est paire" : a+" est impair" );

        System.out.print("Entrez trois entiers : ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(
            (b>=c && b>=d) ? "Le plus grand est : "+b :
             (c>=b && c>=d) ? "Le plus grand est : "+c :
             "Le plus grand est : "+d 
        );

        System.err.print("Entrez la note : ");
        int k=scanner.nextInt();
        System.out.println(
            (k>=10) ? "Résultat : Admin" :
              (k<10 && k>=7) ? "Résultat : Rattrapage" : "Résultat : Echoue");
              scanner.close();
    }

    
}
