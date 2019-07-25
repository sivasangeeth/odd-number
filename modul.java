import java.io.*; 
import java.util.*; 
class  modul{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s=(a*b)%c;
        
        System.out.print(s);
        
    }
}




