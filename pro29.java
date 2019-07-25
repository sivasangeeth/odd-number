import java.util.*;
import java.math.*;

class pro29
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         String sum="",sun="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            sum+=s.charAt(i);
          
            else
            sun+=s.charAt(i);
        }
         System.out.print(sum+" "+sun);
       
    }
}

