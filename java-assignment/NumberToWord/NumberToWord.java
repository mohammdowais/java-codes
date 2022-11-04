// java program to convert integer to word 

import java.util.Scanner;

public class NumberToWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    String[] str = new String[10];
    str[0] = "Zero";
    str[1] = "One";
    str[2] = "Two";
    str[3] = "Three";
    str[4] = "Four";
    str[5] = "Five";
    str[6] = "Six";
    str[7] = "Seven";
    str[8] = "Eight";
    str[9] = "Nine";

    int temp = n;
    int count = 0;
    while (temp > 0) {
      temp /= 10;
      count++;
    }

    int[] arr = new int[count];
    int i = 0;
    while (n > 0) {
      arr[i] = n % 10;
      n /= 10;
      i++;
    }

    for (int j = arr.length - 1; j >= 0; j--) {
      System.out.print(str[arr[j]] + " ");
    }
  }
}