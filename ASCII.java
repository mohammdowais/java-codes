import java.util.Scanner;

public class ASCII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any charcater: ");
    int ch = sc.next().charAt(0);
    System.out.println("ASCII vlue of " + ch + " is: " + ch);

  }
}