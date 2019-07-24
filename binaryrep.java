import java.util.*;
class binaryrep{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='1' || n.charAt(i)=='0')
            {
                count++;
            }
        }
            if(count==n.length())
            System.out.print("yes");
            else
            System.out.print("no");
   }
}




