// program to find average of 6 subjects

import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks in 6 subjects:");

    int sum = 0;
    for (int i = 0; i < 6; i++) {
      sum += sc.nextInt();

    }

    System.out.println("Average marks in 6 subjects:" + sum * 1.0 / 6);

  }
}