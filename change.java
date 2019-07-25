import java.io.*; 
import java.util.*; 
class  change{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n1=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        
        System.out.print(a[1]);
        
    }
}




