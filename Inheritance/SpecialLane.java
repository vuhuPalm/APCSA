
/**
 * Write a description of class SpecialLane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class SpecialLane
{
   ArrayList<DriverlessCar> lane;
   public SpecialLane(){
       lane = new ArrayList<DriverlessCar>();
       Car yourCar = new Car("Your Car", 3, "Trash");
       Car myCar = new KeylessCar("Mr. Wiebe's lame car", "Kia", 2);
       Tesla tesla = new Tesla();
       /*
        * Which cars can be added to my lane?
        * ONly the Tesla
        */
       lane.add(tesla);
       
       Tesla tesla2 = new Tesla();
       DriverlessCar tesla3 = new Tesla();
       //tesla3.move();
    }
}
