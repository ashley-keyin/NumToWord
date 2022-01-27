import java.util.*;

// /*Write a java program which inputs a one digit number from the user (i.e. 0-9). The program should then print that number in words, e.g. “Zero” for 0, “One” for 1, “Two” for 2, and so on. If the user does not enter a one-digit number, then program should display an error: “Invalid number!”. */

public class NumToWord {

  public static void main(String[] args) {
    //create scanner to obtain input from command window

    int num;
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a 1 digit number to return the english word for same: "); //prompt
    num = in.nextInt(); //read number from user
    
    
    switch (num) {
      case 0:
        System.out.println("Zero");
        break;
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      case 4:
        System.out.println("Four");
        break;
      case 5:
        System.out.println("Five");
        break;
      case 6:
        System.out.println("Six");
        break;
      case 7:
        System.out.println("Seven");
        break;
      case 8:
        System.out.println("Eight");
        break;
      case 9:
        System.out.println("Nine");
        break; 

      }
    
  in.close();

  }
}
