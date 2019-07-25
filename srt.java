import java.io.*; 
import java.util.*; 
class  srt{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char a[]=s.toCharArray();
       Arrays.sort(a);
       String s1=String.valueOf(a);
       System.out.print(s1);
    }
}



