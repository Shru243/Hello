package Hello;
import java.util.Scanner;

public class HelloXyz {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter your name: ");
       String str = sc.next();
       System.out.println("Hello! "+ str + " have a good day.");
    }
}
