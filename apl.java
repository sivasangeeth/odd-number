import java.io.*; 
import java.util.*; 
class  apl{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       for(int i=0;i<s.length();i++){
       if(Character.isDigit(s.charAt(i)))
       System.out.print(s.charAt(i));
    }}
}



