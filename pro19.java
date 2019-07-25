import java.util.*;
import java.math.*;
class pro19{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        String st="*",str="**";
            if(n%2!=0)
            {
                String s=a.substring(0,n/2);
                String s1=st.concat(a.substring(n/2+1));
                String s2=s.concat(s1);
                System.out.print(s2);
            }
            else
        {
             String s=a.substring(0,n/2-1);
                String s1=str.concat(a.substring(n/2+1));
                String s2=s.concat(s1);
                System.out.print(s2);
        }
        
    }
}
