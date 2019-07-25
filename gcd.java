import java.io.*; 
import java.util.*; 
class  gcd{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int n1=sc.nextInt();
       int gcd=0;
       for(int i=1;i<=n && i<=n1;i++)
       {
           if(n%i==0 && n1%i==0)
           gcd=i;
       }
       System.out.print(gcd);
    }
}


