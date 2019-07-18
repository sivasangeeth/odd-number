import java.util.*;
class Bs2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
         System.out.print("Vowel");
         else if(Character.isLetter(ch1))
         System.out.print("Consonant");
         else 
         System.out.print("invalid");
    }    
}
