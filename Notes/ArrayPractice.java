
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    int[] arr;
    int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};
    public ArrayPractice(){
        arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }
    }
    
    public void printArr(){
        for (int num : testArr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void removeIndex(int index){
        for (int i = index; i < testArr.length-1; i++){
            testArr[i] = testArr[i+1];
        }
        testArr[testArr.length-1] = 0;
    }
    
    public void AddNum(int num, int index){
        for (int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = num;
        printArr();
    }
    
    public void removeAll(int num){
        for(int i = 0; i < testArr.length-1; i++){
            if(testArr[i] == num) {
                removeIndex(i);
            }
        }
    }
}
