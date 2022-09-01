import java.util.Scanner;
public class IncomeTaxes {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int deduct = 10000;
        System.out.println("Enter the gross income:");
        double grossIncome = scanner.nextDouble();
        
        System.out.println("Ender the number of dependents:");
        int depend = scanner.nextInt();
        
        int afterDepend = depend * 2000;
        double preTax = grossIncome - deduct - afterDepend;
        double finalTax = preTax * 0.2;
        if (finalTax <= 0) {
               finalTax = 0; 
        }    
        System.out.println("The income tax is $" + finalTax); 
    }
}