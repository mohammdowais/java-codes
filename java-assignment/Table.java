// two one are....?
// program to print multiplication table of a number

import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " x " + i + " = " + i * number);
    }
  }
}