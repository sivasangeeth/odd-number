import java.util.*;
class swapbitwise12{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    int b=sc.nextInt();
	    a=a^b;
	    b=a^b;
	    a=a^b;
	    System.out.print(a+" "+b);
	}
}


