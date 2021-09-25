import java.util.Scanner;
import java.lang.Math;
public class OE{
    public static void main(String  args[]) {
      Scanner n=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=n.nextInt();
      if(num%2==0)
      {
      System.out.println("The Number "  + num +  " is Even");
      }
      else
      {
       System.out.println("The Number "  + num +  " is Odd");   
      }
    }
}