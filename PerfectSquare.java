import java.util.Scanner;

public class PerfectSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int sr = (int) Math.sqrt(number);
    if (sr * sr == number) {
      System.out.println(number + " is a perfect Square.");
    } else {
      System.out.println(number + " is not a perfect Square.");
    }
  }
}