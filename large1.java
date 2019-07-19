import java.util.*;
class large1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int s=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        Arrays.sort(a);}
        System.out.print(a[0]+" ");
    }
}
