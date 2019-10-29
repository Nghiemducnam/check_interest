import java.util.Scanner;

public class CheckInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investments amount:");
        double money = input.nextDouble();
        System.out.println("Enter number of month:");
        double month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest = money * (interestRate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + totalInterest);
    }
}
