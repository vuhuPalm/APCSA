import java.lang.Math;
/**
 * Write a description of class RandomNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomNumbers {
    public static void random(){
        //Random number between [0,1)
        double num = Math.random();
        System.out.println(num);
        
        //Randome number between [0, 10)
        double num2 = Math.random() * 10;
        System.out.println(num2);
       
        //Random number between [0, 9]
        int num3 = (int)(Math.random() * 10);
        System.out.println(num3);
        
        //Random number between [44, 100]
        int num4 = (int)(Math.random() * 57) + 44; //57 different possiblities
        System.out.println(num4);
        
        //Random number between [156, 648]
        int num5 = (int)(Math.random() * 493) + 156;
        System.out.println(num5);
    }
}