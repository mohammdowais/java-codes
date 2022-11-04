import java.util.Scanner;

public class PerfectSquareBetween {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter Second number: ");
    int b = sc.nextInt();
    System.out.print("Prfect Square between " + a + "," + b + ": ");
    for (int i = a; i <= b; i++)
      for (int j = 1; j * j <= i; j++)
        if (j * j == i)
          System.out.print(i + " ");
    System.out.println();
  }
}