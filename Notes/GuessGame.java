import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class GuessGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuessGame
{
        static Scanner scanner = new Scanner(System.in);
  public static void guess(){
      int num = (int)(Math.random() * 10 + 1);
      for(int i=0;i<5;i++){
          System.out.println("Guess a number between 1 and 10, including both of them");
          int guess = scanner.nextInt();
          
          if (guess > 10) {
              System.out.println("That number is too high!");
              i--;
            } else if(guess == num){
                
                    System.out.println("Right on!");
                    i = 5;
                } else if (guess > num){
                        System.out.println("Wrong! Try again!");
                        System.out.println("Guess lower!");
                    } else {
                        System.out.println("Wrong! Try again!");
                        System.out.println("Guess higher!");
                    }
                }
        System.out.println("Game over!");
        System.out.println("The correct answer was " + num + "!");

            }  
        }
        