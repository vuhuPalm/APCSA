
/**
 * Write a description of class Kingdom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kingdom
{
   public static final double PI = 3.14159;
   
   public static void kingdomTester(){
       Crown crown = new Crown("gold", "round", 5, 4.3, null);
       crown.owner = "The king";
       Crown crown2 = new Crown("Iron", "Square", 0, 1.1, null);
       crown2.owner = "You";
       
       System.out.println("My crown is made out of " + crown.getMetal());
       System.out.println("You got so much smarter! The crown is too small now!");
       crown.setSize(9001);
       System.out.println("Your brain is massive! It's now a size " + crown.getSize());
       
    }
}
