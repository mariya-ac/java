
import java.util.Scanner;
import java.lang.Math;
public class AddMatrix
{
public static void main(String[] args)
{
 Scanner x=new Scanner(System.in);
 int i,j;
 System.out.println("Enter the number of rows and columns: ");
 int r=x.nextInt();
 int c=x.nextInt();
 int a[][]=new int[r][c];
 int b[][]=new int[r][c];
 System.out.println("Enter elements of 1st matrix");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     a[i][j]=x.nextInt();
   }
 }
 System.out.println("Enter elements of 2nd matrix");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     b[i][j]=x.nextInt();
   }
 }
 System.out.println("Elements of 1st matrix are");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     System.out.print(" "+a[i][j]);
   }
   System.out.println();
 }
 System.out.println("Elements of 2nd matrix are");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     System.out.print(" "+b[i][j]);
   }
   System.out.println();
 }
 System.out.println("Matrix after Addition");
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     System.out.print(" "+(a[i][j]+b[i][j]));
   }
   System.out.println();
 }
}
}