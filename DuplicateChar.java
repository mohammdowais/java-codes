import java.util.Scanner;

public class DuplicateChar {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any String: ");
    String str = sc.nextLine();
    char[] charArray = str.toCharArray();
    System.out.print("Duplicate characters are: ");
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (charArray[i] == charArray[j]) {
          System.out.print(charArray[j] + " ");
          break;
        }
      }
    }
    System.out.println();
  }
}
