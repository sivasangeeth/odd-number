import java.util.*;
class pro13{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int sum,rem=0,rev=0;
       while(n!=0)
       {
           rem=n%10;
           rev+=rem;
           n/=10;
       }
       System.out.print(rev);
   }
}



