import java.io.*; 
import java.util.*; 
class  addit{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.print(sum);
        
    }
}



