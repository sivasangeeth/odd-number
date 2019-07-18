import java.util.*;
class Bs4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
       if(Character.isLetter(ch1))
         System.out.print("Alphabet");
         else 
         System.out.print("No");
    }    
}
