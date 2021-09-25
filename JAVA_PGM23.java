import java.util.*;
import java.io.*;
public class JAVA_PGM23
{
 public static void main(String[] args) {
 LinkedList<String> l_list = new LinkedList<String>();
 l_list.add("Red");
 l_list.add("Green");
 l_list.add("Black");
 l_list.add("Pink");
 l_list.add("orange");
 System.out.println("The Original linked list: " + l_list);
 l_list.clear();
 System.out.println("The New linked list: " + l_list);
 }
}
