import java.util.*;

public class PartieN6 {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        ArrayList<Integer> tab = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
      {System.out.print("donnre le "+i+" nbr: ");
        int z=scanner.nextInt();
        tab.add(z);
       }
       int max =tab.get(0);
       int min=tab.get(0);
       int sum=0;
       
       for(int i=0;i<9;i++)
       {if(tab.get(i)>=max)
          max=tab.get(i);}
        for(int i=0;i<9;i++)
       {if(tab.get(i)<=min)
          min=tab.get(i);}
        
        System.out.println("liste original : "+tab.toString());
        for(int i=0;i<9;i++)
        sum+=tab.get(i);
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("moyenne= "+sum/10.0);

        for(int i=0;i<tab.size();i++)
        for(int j=i+1 ;j<tab.size();j++ )
        if (tab.get(i).equals(tab.get(j)))
        {tab.remove(j);
            j--;}


        System.out.println(tab.toString());
        scanner.close();
    }

}
