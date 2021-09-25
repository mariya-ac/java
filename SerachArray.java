
//Search array element
import java.util.Scanner;
public class SearchArray
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  int i,count=0;
  System.out.print("Enter the size of array  ");
  int l=x.nextInt();
  int a[]=new int[l];
  System.out.println("Enter the elements ");
  for(i=0;i<l;i++)
  {
    a[i]=x.nextInt();
  }
  System.out.println("Enter the element to be search");
  int s=x.nextInt();
  for(i=0;i<l;i++)
  {
    if(s==a[i])
    {
      System.out.println("Element "+s+" found at position "+ (i + 1));
      count=count+1;
    }
  }
  if(count==0)
   System.out.println("Element not found!!!");
  }
}