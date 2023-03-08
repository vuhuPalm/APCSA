
/**
 * Write a description of class ExceptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionTester
{
    public static void test(){
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch(ArithmeticException e){
            System.out.println("You divided by zero!!!! Silly Goose!!");
        }
    }
    
    public static void test2(int a) throws Exception{
        if(a > 10){
            System.out.println("You typed in a big number!");
        } else if (a < 0){
            throw new Exception("The number is negative!");
        } else {
            throw new Exception("What is this?");
        }
    }
    
    public static void test3(){
        try{
            test2(9);
        } catch(WiebeException e){
            System.out.println("You got a WIEBE exception! It says: " + e);
        } catch (Exception e){
            System.out.println("You got a generic exception: " + e);
        }
    }
}
