import java.util.Scanner;
/**
 * asks user of integer, tells them if it is a prime # or not
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make the scanner to get input
    Scanner input = new Scanner(System.in);

    //init variables
    int number; //the number given by the user
    int counter = 2; //the variable to increase every time the loop repeats (starts at 2 because prime numbers are divisible by 1)
    int remainder; //the remainder of number / counter

    //ask user for number
    System.out.println("Which number would you like to check?");
    number = input.nextInt();

    while(counter < number){ //repeat as long as the counter is less than the number
      //check if number is divisible
      remainder = number % counter;

      //check if remainder is 0 (it is not prime)
      if (remainder == 0){
        //tell the user it is not a prime
        System.out.println(number + " is not a prime number");
        break;
      }

      //increase the counter by 1
      counter = counter + 1;
    }
    
    //check if the counter reached the given number without being divisible by anything
    if (counter == number){
      System.out.println(number + " is a prime number");
    }
  }
}
