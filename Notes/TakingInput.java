import java.util.Scanner;
/**
 * Write a description of class TakingInput here.
 *
 * @author Dylan
 * @version 8/25/22
 */
public class TakingInput
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        /*
         * Have the user type in a name
         * Have the computer say hello (and their name).
         * 
         * Ask for their favorite color
         * Have the computer tell them their favorite color is bad.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name");
        String name = scanner.next();
        
        System.out.println("Hello " + name);
        System.out.println();
        
        System.out.println("Type in your favorite color");
        String color = scanner.next();
        System.out.println("Yikes " + name + ","  + color + " is a horrible choice.");
    }
    private static void aMethod() {
        System.out.println("Try to run this");
    }
    public static void runThis(){
        aMethod();
    }
    public static int method1(){
        int a = 5;
        a++; // Its the same as a+=1, or a = a +1;
        System.out.println(a);
        a--;
        System.out.println(a); //decrements a
        
        //Other things
        a *= 5;
        a /= 10;
        a %= 2;
        
        return a;
    }
    /** Ask for a user's name
     * 
     * @return The user's name
     */
    public static String getName(){
        System.out.println("What is your name?");
        String name = scanner.next();
        return name;
    }
    public static int getAge(){
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        return age;
    }
    public static void addStuff(){
        //System.out.println(age + 1); //Age is defined in a different method 
    }
}