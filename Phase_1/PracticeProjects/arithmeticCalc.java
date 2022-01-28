package phase1;

import java.util.Scanner;

public class arithmeticCalc {

 public static void main(String[] args) {

    int choice;
    Double number1, number2, result;
    Scanner in = new Scanner(System.in);
    System.out.println("press 1 for addition");
    System.out.println("press 2 for subtraction");
    System.out.println("press 3 for multiplication");
    System.out.println("press 4 for division");
    System.out.println("Enter your choice:");
    choice = in.nextInt();
    System.out.println("Enter first number");
    number1 = in.nextDouble();
    System.out.println("Enter second number");
    number2 = in.nextDouble();
    switch (choice) {
      case 1:
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case 2:
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case 3:
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case 4:
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
  }
}