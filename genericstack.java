import java.util.*;
import java.io.*;
class stack<T> {
    ArrayList<T> A;
    int top = -1, size;

    stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}
public class import java.util.*;
import java.io.*;
class stack<T> {
    ArrayList<T> A;
    int top = -1, size;

    stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}
public class genericstack {
    public static void main(String[] args)
    {
        stack<Integer> s1=new stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Integer stack s1 contains :\n" + s1);
        s1.pop();
        System.out.println("s1 after pop :\n" + s1);

        stack<String> s2= new stack<>(3);
        s2.push("Hello");
        s2.push("World");
        s2.push("Java");
        System.out.println("\nString stack s2 contents: \n" + s2);

        stack<Float> s3= new stack<>(2);
        s3.push(100.0f);
        s3.push(200.0f);
        System.out.println("\nFloat stack s3 contents: \n" + s3);
        System.out.println("\nTop element of s3 : \n" + s3.top());

    }
} {
    public static void main(String[] args)
    {
        stack<Integer> s1=new stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Integer stack s1 contains :\n" + s1);
        s1.pop();
        System.out.println("s1 after pop :\n" + s1);

        stack<String> s2= new stack<>(3);
        s2.push("Hello");
        s2.push("World");
        s2.push("Java");
        System.out.println("\nString stack s2 contents: \n" + s2);

        stack<Float> s3= new stack<>(2);
        s3.push(100.0f);
        s3.push(200.0f);
        System.out.println("\nFloat stack s3 contents: \n" + s3);
        System.out.println("\nTop element of s3 : \n" + s3.top());

    }
}