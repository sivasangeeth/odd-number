import java.util.*;
class pro24
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=Integer.parseInt(s);
        int rev=0,rem=0;
        while(n!=0){
            rem=n%10;
            rev=rem;
            n/=10;
            if(rev%2!=0)
            System.out.print(rev+" ");
    }}
}

