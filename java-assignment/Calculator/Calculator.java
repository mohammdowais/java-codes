// Simple Calculator

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    char operator;
    Double number1, number2, result = 0.0;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number:");
    number1 = input.nextDouble();

    System.out.println("Enter second number:");
    number2 = input.nextDouble();

    int flag = 0;
    switch (operator) {

      case '+':
        result = number1 + number2;
        break;

      case '-':
        result = number1 - number2;
        break;

      case '*':
        result = number1 * number2;
        break;

      case '/':
        result = number1 / number2;
        break;

      default:
        System.out.println("Invalid operator!");
        flag = 1;
        break;
    }
    if (flag == 0) {
      System.out.print(number1 + " " + operator + " " + number2 + " = " + result);
    }
  }
}