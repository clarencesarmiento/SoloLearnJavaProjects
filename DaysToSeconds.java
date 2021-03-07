import java.util.Scanner;

// Converts days to seconds 
public class DaysToSeconds {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int days = scanner.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println(days + " days = " + seconds + " seconds.");
    }
    
}
