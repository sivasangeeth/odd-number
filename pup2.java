import java.util.*;
import java.math.*;
class pup2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a[n1-1]%2==0)
        System.out.print(a[n1]);
        else
        System.out.print(a[n1-1]);
    }
}
