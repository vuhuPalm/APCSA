
/**
* Write a description of class StringPractice here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class StringPractice
{
    public static void main(){
        String string1 = "hello";
        // Since we are counting the length, it starts at 1
        System.out.println(string1.length());  // We get 5
        
        String str = "The quick brown fox jumps over the lazy dog";
        
        //Substring deals with an index. Indicies start at 0.
        System.out.println(str.substring(0,1));  // "T"
        System.out.println(str.substring(4,5));  // "q"
        System.out.println(str.substring(16,19));  // "fox"
        
        //print "lazy"
        String str2 = str.substring(35,39);
        System.out.println(str2 == "lazy"); // False
        System.out.println(str2.equals("lazy")); //True
        
        System.out.println(str.indexOf("e",3));
        
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.substring(i, i + 1));
        }
        
        System.out.println(str.substring(35));
        
        //This.compareTo(other);
        
        System.out.println("bad".compareTo("badlands"));
        System.out.println("B".compareTo("b"));
    }
}