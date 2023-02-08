import java.lang.Math;
/**
 * Write a description of class Algorithms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Algorithms
{
    int[] arr;
    
    public Algorithms(){
        arr = new int[10];
        for(int q = 0; q < arr.length; q++){
            arr[q] = (int)(Math.random() * 10 + 1);
        }
    }
    
    public void print(){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void bubbleSort(){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int x = arr[j];
                    int y = arr[j+1];
                    arr[j] = y;
                    arr[j+1] = x;
                }
            }
        }
    }
    
    public void selectionSort(){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int min = arr[i];
                if(arr[i] > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
    }
    
    public void insertionSort(){
        int tempppppp;
        int first;
        for(int i = 0; i < arr.length; i++){
            tempppppp = arr[i];
            first = i-1;
            while(first >= 0 && arr[first] > tempppppp){
                arr[first+1] = arr[first];
                first = first-1;
            }
            arr[first+1] = tempppppp;
        }
    }
}
