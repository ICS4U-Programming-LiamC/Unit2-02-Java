import java.util.Scanner;

/**
* The code gets a number from the user and calculates it's factorial.
* Only works for natural numbers as outlined by the factorial function.
* 
*
* @author  Liam Csiffary
* @version 1.2
* @since   2022-03-29
*/

// class
public class factorial {

  // the function which calculates the factorial
  public static double factorialCalcer(double number) {
    // base cases, if either 0 or 1 return 1
    if (number == 0 || number == 1) {
      return 1;
    } else {
      // otherwise sends the number -1 to the function and returns
      // that * number
      return (factorialCalcer(number - 1) * number);
    }
  }

  // main function
  public static void main(String[] args) throws Exception {
    // greets user
    System.out.println("Welcome! This program calculates the factorial of a given number!");

    // defines vars
    Scanner scanner = new Scanner(System.in);
    String userInputString = "";
    double userInputDouble = 0d;

    // while true, breaks if the user inputs exit
    while (true) {

      // gets users input
      System.out.println("Please input a natural number (exit to exit): ");
      userInputString = scanner.nextLine().toLowerCase();

      // breaks if user inputed exit
      if (userInputString.equals("exit")) {
        break;
      }

      // tries to convert to an int, then makes sure it's positive
      // the int() function returns an error if its a decimal
      try {
        userInputDouble = Double.parseDouble(userInputString);
        if (userInputDouble >= 0 && userInputDouble % 1d == 0d) {
          double answer = factorialCalcer(userInputDouble);
          System.out.println(userInputDouble + "'s factorial is " + answer);
        } else {
          System.out.println("Number must be natural (positive and whole)");
        }
      } catch (NumberFormatException e) {
        System.out.println("Please input a natural number");
      }
    }
  }
}
