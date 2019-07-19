import java.util.Scanner;
public class Arms1 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      String s=String.valueOf(num1);
      int len=s.length();
      for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum +(int)Math.pow(rem,len);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(i+" ");
         }
      }
   }
}

