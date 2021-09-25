
import java.util.Scanner;
class Product
{                              
int pcode;
String pname;
double price;

public void Data()
{
Scanner s=new Scanner(System.in);
System.out.print("Enter  The Product Code:");
pcode=s.nextInt();
System.out.print("Enter The Product Name:");  
pname=s.next();
System.out.print("Enter The Product Price:");  
price=s.nextDouble();
}

public Product low(Product p1,Product p2)
{

Product temp=new Product();
if(this.price<p1.price && this.price<p2.price)
temp=this;
else if(p1.price<this.price && p1.price<p2.price)
temp=p1;
else if(p2.price<this.price && p2.price<p1.price)
temp=p2;
return temp;
}

public void display()
{
System.out.println("PRODUCT CODE:"+pcode);
System.out.println("PRODUCT NAME:"+pname);
System.out.println("PRODUCT PRICE:"+price);
}
}
public class Lowprice
{
public static void main(String args[])
{
Product p=new Product();
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
p1.Data();
p2.Data();
p3.Data();
p=p3.low(p1, p2);
System.out.println("Details of First Product");
p1.display();
System.out.println("Details of Second Product");
p2.display();
System.out.println("Details of Third Product");
p3.display();
System.out.println("Product with Lowest Price");
p.display();



}
}