//Graeatest of three

import java.util.Scanner;

public class Greatest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Three Numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int g = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

    System.out.println("Gretest number is:" + g);
  }
}