import java.util.*;
class Bs2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
         System.out.print("Vowel");
         else if(Character.isLetter(ch))
         System.out.print("Consonant");
         else 
         System.out.print("invalid");
    }    
}
