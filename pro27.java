import java.util.*;
import java.math.*;

class pro27
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char b=sc.next().charAt(0);
        int n1=sc.nextInt();
        if(b=='/')
        System.out.print(n/n1);
        else
        System.out.print(n%n1);
    }
}

