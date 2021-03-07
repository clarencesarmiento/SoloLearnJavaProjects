import java.util.Scanner;


public class LoanCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        // Code goes here
        for(int month = 0; month < 6; month++){
            int payment = (amount * 10)/100;
            if((amount % 10) != 0){
                amount -= 1;
            }
            amount -= payment;
        }
        System.out.println(amount);
    }
}
