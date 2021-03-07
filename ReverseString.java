import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text = scanner.nextLine();
	char[] arr = text.toCharArray();
        // your code goes here
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--){
            System.out.println(arr[i]);
            }
    }
}
