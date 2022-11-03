// the fibonacci sequence

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int limit = sc.nextInt();
    int n1 = 0;
    int n2 = 1;
    System.out.println("Fibinacci serie upto " + limit + " numbers : ");

    System.out.print(n1 + " " + n2);
    for (int i = 2; i < limit; ++i) {
      int n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    System.out.println();

  }
}