public class NestedForLoops {
    public static void method1(){
        for(int i=0;i<5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void method2(){
        for(int i=5;i>0;i--){
            for(int j=0; j<i;j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    public static void method3(){
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void method4(){
        for(int i=5;i>=1;i--){
            for(int j=5; j>=i;j--){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}