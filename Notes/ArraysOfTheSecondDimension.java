
/**
 * Write a description of class ArraysOfTheSecondDimension here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysOfTheSecondDimension
{
    int[] arr;
    int[][] arr2;
    int[][] arr3;
    int[] pixel;
    int[][][] picture;
    int[][][][][][][][][][] tenDArray;
    public ArraysOfTheSecondDimension(){
        arr = new int[10];
        arr2 = new int[10][10];
        arr3 = new int[3][5];
        pixel = new int[3];
        tenDArray = new int[5][5][5][5][5][5][5][5][5][5];
    }
    /**Fills the array arr with numbers starting at 1
     * 
     */
    public void fillArr(){
        int count = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = count;
            count++;
        }
    }
    /**Fills the array arr2 with numbers starting at 1
     * 
     */
    public void fillArr2(){
        int count = 1;
        
        //Row-Major format = first loop is rows and second is columns
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2.length; j++){
                arr2[i][j] = count;
                count++;
            }
        }
    }
    public void fillArr3
    (){
        int count = 1;
        
        //Row-Major format = first loop is rows and second is columns
        //arr3.length is the number of rows
        //arr[0].length is the number of columns (or the length of one row)
        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[0].length; j++){
                arr3[i][j] = count;
                count++;
            }
        }
    }
    public void print2DArray(){
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void betterPrint(){
        for(int[] row: arr2){
            for(int num: row){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}
