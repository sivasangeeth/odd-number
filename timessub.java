import java.util.*;
import java.math.*;
class timessub{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=n-b;
        int e=a-c;
        System.out.print(Math.abs(d)+" "+Math.abs(e));
    }
}

