
/**
 * Write a description of class ArrayListTests here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTests
{
    //ArrayList containing int arrays  
    ArrayList<int[]> test;
    
    //Array containing ArrayLists (made up of integers)
    ArrayList<Integer>[] test1;
    
    //ArrayList containing Boolean ArrayLists
    ArrayList<ArrayList<Boolean>> test2;
    
    //Two dimensional array containing ArrayLists (made up of Scanners)
    ArrayList<ArrayList<Scanner>>[][] test3;
    
    public static void thing(){
        String[] a = new String[5];
        ArrayList<Float> b = new ArrayList<Float>();
        ArrayList<String[]> c =  new ArrayList<String[]>();
        
        //Get the first item from b
        Float f = b.get(0);
        //Get the first item of a 
        String aValue = a[0];
        //Get the first item from c (What data type is it?)
        String[] e = c.get(0);
    }
}
