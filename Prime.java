
import java.util.*;
public class Prime{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int i,j,n,c;
 System.out.println("Enter the number till which you want prime numbers");
 n=sc.nextInt();
 System.out.println("Prime numbers are :-");    
    
 for(i=2;i<=n;i++)
     {
         c=0;
         for(j=1;j<=i;j++)
         {
               if(i%j==0)
               {
                   c++;
               }
         }
         
       if(c==2)
       {
             System.out.print(i+" ");
         }
     }
 }
}