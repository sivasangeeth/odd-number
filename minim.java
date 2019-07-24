import java.util.*;
class minim{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[args.length];
        for(int i=0;i<n.length;i++)
        {
            n[i]=Integer.parseInt(args[i]);
        }
        Arrays.sort(n);
         System.out.print(n[0]);
        
              }
}




