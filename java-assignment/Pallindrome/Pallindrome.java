// Is the number pallindrom?

import java.util.Scanner;

public class Pallindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    int original = number;
    int reverse = 0;
    while (number > 0) {
      int lastDigit = number % 10;
      reverse = reverse * 10 + lastDigit;
      number /= 10;
    }

    if (reverse == original) {
      System.out.println("Its a Pallindrome");
    } else {
      System.out.println("Its not a Pallindrome");
    }

  }
}