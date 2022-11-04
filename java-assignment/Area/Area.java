// circle Area and circumference

import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of Circle:");
    float radius = sc.nextFloat();

    float area = (float) 3.14 * radius * radius;
    float circumference = (float) (2 * 3.14 * radius);

    System.out.println("Area of Circle: " + area + " unit square");
    System.out.println("Circumference of Circle: " + circumference + " units");

  }
}