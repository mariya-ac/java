
import java.util.Scanner;
public class publisher {

    Scanner reader=new Scanner(System.in);
    String name;
    public publisher(){
        name=" ";
    }
    public void input(){
        System.out.print("Enter publisher name: ");
        name=reader.next();
    }
}
class book extends publisher {
    String bname;
    int bid;

    public book() {
        bname = " ";
        bid = 0;
    }

    public void binput() {
        System.out.print("Enter book id: ");
        bid = reader.nextInt();
        System.out.print("Enter book name: ");
        bname = reader.next();

    }
}
class fiction extends book{
    String fic;
    public fiction(){
        fic=" ";
    }
    void finput(){
        System.out.print("Specify fiction or non fiction: ");
        fic=reader.next();
    }
} 
class literature extends book {
    String lit;

    public literature() {
        lit = " ";
    }

    void linput() {
        System.out.print("Enter type of literature: ");
        lit = reader.next();
    }

    public static void main(String[] args) {
        literature i = new literature();
        fiction f=new fiction();
        i.input();
        i.binput();
        f.finput();
        i.linput();
        System.out.println("\nBOOK DETAILS: ");
        System.out.println("Publisher name: " + i.name);
        System.out.println("Book id: " + i.bid);
        System.out.println("Book name: " + i.bname);
        System.out.println("Fiction or non-fiction: " + f.fic);
        System.out.println("Literature type: " + i.lit);

    }
}