import java.util.*;
class times{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a=n1%60;
        int b=n1/60;
        System.out.print(b+" "+a);
    }
}

