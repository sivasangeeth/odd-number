import java.util.*;
class rev
{
    public static void main(String args[])
    {
    int a,b,sum=0;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    while(a>1)
    {
        b=a%10;
        sum=sum*10+b;
        a=a/10;
    }
    System.out.println(sum);
}
}


