import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();
    System.out.println("\nPattern one");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
    System.out.println("\nPattern two");
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    System.out.println("\nPattern three");
    int k = 65;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {

        System.out.print((char) k++ + " ");
      }
      System.out.println();
    }
    // System.out.println((char) (65 + 15));

  }
}