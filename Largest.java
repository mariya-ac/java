
import java.util.Scanner;
public class Largest{
    public static void main(String [] args) {
      Scanner n=new Scanner(System.in);
      System.out.print("Enter  the first number:");
      int num1=n.nextInt();
      System.out.print("Enter  the second number:");
      int num2=n.nextInt();
      System.out.print("Enter  the third number:");
      int num3=n.nextInt();
      if(num1>num2&&num1>num3)
            System.out.println("The number " + num1 + " is largest");
        else if(num2>num1&&num2>num3)
             System.out.println("The number " + num2 + " is largest");
            else
                  System.out.println("The number " + num3 + " is largest");
      }
}