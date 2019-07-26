import java.util.*;
class crt{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int n1=sc.nextInt();
        String s;
       s=n.substring(n.length()-n1);
        System.out.print(s);
    }
}
