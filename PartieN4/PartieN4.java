import java.util.*;
public class PartieN4 {
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        int [] tab1d ={4,12,5,9,7};
        System.out.println("Tableau : "+Arrays.toString(tab1d));
        Arrays.sort(tab1d);
        int sum=0;
        for(int i=0;i<5;i++)
        sum+=tab1d[i];
        System.out.println("Matrice : "+Arrays.toString(tab1d));
        System.out.println("Max = " + tab1d[4]+
                        "\nMoyenne = "+sum/5);

         int [][] tab2d= {{1,2,3},{4,5,6}};
        int s=0;
        for(int [] row : tab2d)
        for(int i : row)
        s=s+i;
        System.out.println("Matrice : "+Arrays.deepToString(tab2d));
        System.out.println("Somme = "+s);


        int [] tab_normal ={4,5,86,76,48};
        int [] invtab=new int [tab_normal.length];
        for(int i=tab_normal.length-1,j=0;i>=0;i-- )
        invtab[j++]=tab_normal[i];
        System.out.println("Matrice : "+Arrays.toString(tab_normal));
        System.out.println("Matrice invers : "+Arrays.toString(invtab));

       
        scanner.close();
    }
}
