import java.util.Scanner;

public class Ca2 {
    public static void main(String[] args) {

        Scanner muleya = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = muleya.nextInt();
        System.out.print("Enter the second number: ");
        int b = muleya.nextInt();

        int c = a - b;

        System.out.println("The answer = " + c);
    }
}
