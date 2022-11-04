import java.util.Scanner;

public class NoOfCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string: ");
    String str = sc.nextLine();
    System.out.println("Number of characters in string are:" + str.length());

  }
}