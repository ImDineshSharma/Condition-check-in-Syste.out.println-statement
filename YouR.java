import java.util.Scanner;
public class YouR{
   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your age");
   double age = sc.nextDouble();
   
   System.out.println( age < 28 ? " You are young " : " You are old!! ");
   
   }
}
