
import java.util.Scanner;
import java.lang.Math;
public class Palindrome{

    public static void main(String args[])
    {
   Scanner n= new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = n.nextInt();
     int sum = 0, r;
   int temp = num;    
     while(num>0)
     {    
        r = num % 10;   
        sum = (sum*10)+r;    
        num = num/10;    
       }    
      if(temp==sum)    
        System.out.println(temp+" is a Palindrome number");    
      else    
        System.out.println(temp+"  is Not a palindrome");    
     }  
}