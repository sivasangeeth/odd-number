import java.util.*;
class pro7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int a[]=new int[s];
       for(int i=0;i<s;i++)
       {
           a[i]=sc.nextInt();
       }
       System.out.print(a[0]+" ");
       System.out.print(a[s-1]+" ");
   
   }
}


