
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    int[] arr;
    public ArrayPractice(){
        arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }
    }
    
    public void printArr(){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void removeIndex(int index){
        for (int i = 0; i < arr.length; i++){
            if(i >= index){
                if(i+1 < arr.length){
                arr[i] = arr[i+1];
               } else {
                arr[i] = 0;
                }
            }
        }
        printArr();
    }
    
    public void AddNum(int num, int index){
        for (int i = arr.length; i > index; i--){
            arr[i-1] = num;
        }
        printArr();
    }
}
