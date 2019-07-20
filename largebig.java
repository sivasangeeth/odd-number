import java.util.*;
class largebig{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        int temp=0;
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<a1.length;i++){
       // Arrays.sort(a1);
        System.out.println(a1[i]+" "+i);}
    }
}

