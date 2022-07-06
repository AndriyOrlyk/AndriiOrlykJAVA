package first;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static Scanner scanner;

  public static void main(String[] args) {
    try {
      scanner = new Scanner(System.in);
      boolean isEnd = false;
      while (!isEnd) {
        System.out.println("Second task should to enter in russian!");
        System.out.println("Please choose number of task you want to check: ");
        System.out.println("1. if the entered number is greater than 7, then output 'Hi'");
        System.out.println("2. if the entered name matches Vyacheslav, then output 'Hi, Vyacheslav', if not, then output 'This name is not exist '");
        System.out.println("3. there is an array of an array at the input, you need to output an array multiple of 3");
        try {
          int taskNumber = scanner.nextInt();
          switch (taskNumber) {
            case 1:
              System.out.println(firstProcess());
              break;
            case 2:
              System.out.println(secondProcess());
              break;
            case 3:
              System.out.println(thirdProcess());
              break;
            default:
              System.out.println("Wrong number");
          }
          System.out.println("Do you want to continue? y/n");
          if (!"y".equalsIgnoreCase(scanner.next())) {
            isEnd = true;
          }
        } catch (InputMismatchException e) {
          System.out.println("Please enter correct number");
        }
      }
    } finally {
      scanner.close();
    }
  }

  private static String firstProcess() {
    System.out.println("Enter the number");
    long numberInput = scanner.nextLong();
    return TransformWordsFunction.transformIfMoreThanSeven(numberInput);
  }

  private static String secondProcess() {
    System.out.println("Enter the Word");
    String input = scanner.next();
    return TransformWordsFunction.transformIfVyacheslav(input);
  }

  private static String thirdProcess() {
    List<Long> inputList = new ArrayList<>();
    System.out.println("Enter the input array, or \"e\" to finish entering");
    String input = scanner.next();
    do {
      try {
        inputList.add(Long.parseLong(input));
        input = scanner.next();
      } catch (NumberFormatException e) {
        System.out.println("please enter the number < 9 * 2^18");
      }
    } while (!"e".equalsIgnoreCase(input));
    return ListTransformer.TransformToString(TransformListFunction.findElementsMultiplesOfThree(inputList));
  }
}

