import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int factorial = 1;
    while (n > 0) {
      factorial *= n;
      n--;
    }
    System.out.println("Factorial: " + factorial);

  }
}