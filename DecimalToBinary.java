import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();

    int[] binary = new int[1000];
    int i = 0;
    while (n > 0) {
      // storing remainder in binary array
      binary[i] = n % 2;
      n = n / 2;
      i++;
    }

    System.out.print("Binary of the given number: ");
    for (int j = i - 1; j >= 0; j--)
      System.out.print(binary[j]);
    System.out.println();
  }
}