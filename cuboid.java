import java.io.*; 
import java.util.*; 
class  cuboid{ 

    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int va=2*((l*b)+(b*h)+(h*l));
        int cub=l*b*h;
        System.out.print(va+" "+cub);
    }
}



