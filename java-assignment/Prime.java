// is your number prime?

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int n = sc.nextInt();
    int flag = 1;
    if (n <= 1) {
      System.out.println("Not Prime");
      flag = 0;
    }

    // Check if number is 2
    else if (n == 2)
      System.out.println("Prime");

    // Check if n is a multiple of 2
    else if (n % 2 == 0) {
      System.out.println("Not Prime");
      flag = 0;
    }

    // If not, then just check the odds
    int i;
    for (i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        System.out.println("Not Prime");
        flag = 0;
        break;
      }
    }
    if (flag == 1) {
      System.out.println("Prime");
    }

  }
}