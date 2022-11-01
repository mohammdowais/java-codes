import java.util.Scanner;

public class SumofNatural {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first and last number: ");
    int a = sc.nextInt();
    int l = sc.nextInt();
    int n = l - a + 1;
    System.out.println("Sum of numbers from" + a + " to " + l + " is: " + n * (a + l) / 2);
  }
}