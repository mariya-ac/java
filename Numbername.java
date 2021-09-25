import java.util.Scanner;
class Numbername {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 9:");
        int num=n.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("The number name of "+num+"  is one");
            break;
            case 2:
            System.out.println("The number name of "+num+"  is two");
            break;
            case 3:
            System.out.println("The number name of "+num+"  is three");
            break;
            case 4:
            System.out.println("The number name of "+num+"  is four");
            break;
            case 5:
            System.out.println("The number name of "+num+"  is five");
            break;
            case 6:
            System.out.println("The number name of "+num+"  is six");
            break;
            case 7:
            System.out.println("The number name of "+num+"  is seven");
            break;
            case 8:
            System.out.println("The number name of "+num+"  is eight");
            break;
            case 9:
            System.out.println("The number name of "+num+"  is nine");
          break;
            default:
            System.out.println("Invalid entry");
        }
    }