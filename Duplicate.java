import java.util.*;
class Duplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        
       for(int i=0;i<a.length;i++)
       {
          
               if(a[i]==s)
               {
              count++;
         //    System.out.println("Brute forceusing Duplicate"+a[j]);
               }
       }
      System.out.println(count);
    }
}




