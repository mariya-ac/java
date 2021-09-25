
import java.util.Scanner;
public class SymmetricMatrix
{
public static void main(String[] args)
{
 Scanner x=new Scanner(System.in);
 int i,j,count=0;
 System.out.println("Enter the number of rows and columns: ");
 int r=x.nextInt();
 int c=x.nextInt();
 int a[][]=new int[r][c];
 int b[][]=new int[r][c];
 System.out.println("Enter elements of matrix");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     a[i][j]=x.nextInt();
   }
 }
 System.out.println("Elements of matrix are");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     System.out.print(" "+a[i][j]);
   }
   System.out.println();
 }
 if(r==c)
 {
 //transpose
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     b[i][j]=a[j][i];
   }
 }
 System.out.println("Transpose");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     System.out.print(" "+b[i][j]);
   }
   System.out.println();
 }
//Symmetric
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    if(a[i][j]!=b[i][j])
     count=1;
  }
}
if(count==0)
 System.out.println("It is a Symmetric Matrix");
else
  System.out.println("It is not a Symmetric Matrix");
}
 else
  System.out.println("It is not a Square matrix");
}
}