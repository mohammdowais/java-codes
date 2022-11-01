import java.util.Scanner;

public class Even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many even numbers do you want?:");
    int a = sc.nextInt();
    System.out.println(a + " Even Numbers are:");
    for (int i = 0; i < a * 2; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

  }
}