import java.io.*; 
import java.util.*; 
class  SImpleInterest{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float t=sc.nextFloat();
        float r=sc.nextFloat();
        float si=(p*t*r)/100;
       System.out.print((int)Math.floor(si));
        
    }
}




