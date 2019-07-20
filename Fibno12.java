import java.util.*;
class Fibno12{
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int t=0,t1=1,sum;
	    System.out.print(t1+" ");
	    for(int i=1;i<n;i++)
	    {
	        sum=t+t1;
	        t=t1;
	        t1=sum;
	        System.out.print (sum+" ");
	    }
	}
}


