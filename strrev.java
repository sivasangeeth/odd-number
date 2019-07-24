import java.util.*;
class strrev{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1=String.valueOf(sb);
        if(s.equals(s1))
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
