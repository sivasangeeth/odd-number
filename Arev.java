import java.util.*;
import java.math.*;
class Arev{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,rem=0,res=0;
	    while(n!=0)
	    {
	        rem=n%10;
	        res=res*10+rem;
	        n=n/10;
	    }
	    if(num==res)
	    System.out.print("yes");
	    else
	    System.out.print("no");
	}
}

