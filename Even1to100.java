public class Even1to100 {
  public static void main(String[] args) {
    System.out.println("Even number from 1 to 100: ");

    for (int i = 2; i <= 100; i++) {
      if (i % 2 == 0)
        System.out.print(i + " ");
    }
    System.out.println();

  }
}