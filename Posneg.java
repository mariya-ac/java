
import java.util.Scanner;
public class Posneg{
    public static void main(String [] args) {
      Scanner n=new Scanner(System.in);
      System.out.print("Enter  the number:");
      int num=n.nextInt();
      String x=(num>0)?"POSITIVE":"NEGATIVE";
       System.out.println("The number " + num + " is a "+x+ " number.");
      }
}