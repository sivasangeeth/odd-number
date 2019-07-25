import java.util.*;
class rev1
{
    public static void main(String args[])
    {
    int a,b=0,sum=1;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    while(a!=0)
    {
        b=a%10;
        sum=sum*b;
        a=a/10;
    }
    System.out.println(sum);
}
}



