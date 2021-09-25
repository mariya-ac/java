
import java.util.Scanner;
public class Factorial{
    public static void main(String  args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=reader.nextInt();
      int i,fact=1;
      for(i=1;i<=num;i++)
      {
          fact=fact*i;
      }
      System.out.println("Factorial of " + num + " is : " +fact);
    }
}