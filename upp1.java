import java.util.*;
class upp1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String s[]=s1.split(" ");
        String output="";
      for(int i=0;i<s.length;i++)
       {
         output = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        System.out.print(output+" ");
       }
        
    }
}
