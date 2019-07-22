import java.util.*;
class digandalp{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();int count=0,count1=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
          if(Character.isLetter(ch))
          {
              count++;
          }
         else if(Character.isDigit(ch))
         {
                count1++;
         }
        
        }
        if(count>0 && count1>0)
        {
            System.out.print("yes");
        }
       else 
       System.out.print("No");
    }
}


