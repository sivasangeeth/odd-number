import java.util.*;
class cmdmax{
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
		    a[i]=Integer.valueOf(args[i]);
		}
		Arrays.sort(a);
		System.out.print(a[a.length-1]);
	}
}


