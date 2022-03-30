import java.util.Scanner;

/**
* The code gets a number from the user and calculates it's factorial.
* Only works for natural numbers as outlined by the factorial function.
* 
*
* @author  Liam Csiffary
* @version 1.12
* @since   2022-03-29
*/

// class
public class factorial {

  // the function which calculates the factorial
  public static float factorialCalcer(float number) {
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
    float userInputFloat = 0f;

    // while true, breaks if the user inputs exit
    while (true) {
      if (userInputString.equals("exit")) {
        break;
      }

      // gets users input
      System.out.println("Please input a whole positive int (exit to exit): ");
      userInputString = scanner.nextLine();

      // tries to convert to an int, then makes sure it's positive
      // the int() function returns an error if its a decimal
      try {
        userInputFloat = Float.parseFloat(userInputString);
        if (userInputFloat >= 0 && userInputFloat % 1f == 0f) {
          float answer = factorialCalcer(userInputFloat);
          System.out.println(userInputFloat + "'s factorial is " + answer);
        } else {
          System.out.println("Number must be natural (positive and whole)");
        }
      } catch (NumberFormatException e) {
        System.out.println("Please input a natural number");
      }
    }
  }
}
