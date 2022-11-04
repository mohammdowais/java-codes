//program to find n even numbers

import java.util.Scanner;

public class Even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many even numbers do you want?:");
    int n = sc.nextInt();
    System.out.println(n + " Even Numbers are:");
    for (int i = 0; i < n * 2; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

  }
}