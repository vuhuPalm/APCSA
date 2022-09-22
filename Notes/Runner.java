import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    static Scanner scanner = new Scanner(System.in);
    public static void Runner(){
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        System.out.println("Your total is " + playerHand.getTotal());
        System.out.println("The dealer's first card is " + dealerHand.getCard1() + ".");
        for (int i=0;i<1;i--){
            System.out.println("Type \"yes\" to hit or type \"no\" to stand");
            Scanner scanner = new Scanner(System.in); 
            String answer = scanner.next();
            if(answer.equals("yes")) {
                System.out.println("Your next card is " +  playerHand.hit());
                System.out.println("Your total is " + playerHand.getTotal());
                if(playerHand.getTotal() >= 22){
                    System.out.println("Oops, you busted! Your total is " + playerHand.getTotal() + ". Which is greater than 21!");
                    i = 5;
                }
            } else if(answer.equals("no")) {
                i = 5;
                System.out.println("The dealer's second card is " + dealerHand.getCard2() + ".");
                System.out.println("Their total is " + dealerHand.getTotal() + ".");
                while (dealerHand.getTotal() < 17){
                System.out.println("The dealer hit and got a " + dealerHand.hit() + ". Their new total is " + dealerHand.getTotal());
                if(dealerHand.getTotal() >= 22) {
                    System.out.println("The dealer busted! You won!");
                }
            }
        }
        }
        if(playerHand.getTotal() == dealerHand.getTotal()){
            System.out.println("Your hand was the same. Neither of you won!");
        } else if(playerHand.getTotal() > dealerHand.getTotal() && playerHand.getTotal() < 22){
                System.out.println("Your hand was better than the dealer's. You won!");
            } else if(dealerHand.getTotal() < 22) {
                System.out.println("The dealer's hand was better than yours. You lost!");
            }
    }
}
