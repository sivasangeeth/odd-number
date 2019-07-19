import java.util.*;
class arms{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int len=s.length();
        int remain=0,arm=0;
        int num=n;
       while (n!=0)
       {
           remain=n%10;
           arm=arm+(int)Math.pow(remain,len);
           n/=10;
       }
       if(num==arm)
       System.out.print("yes");
       else
       System.out.print("no");
    }
}
