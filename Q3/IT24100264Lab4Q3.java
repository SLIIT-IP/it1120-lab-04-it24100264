import java.util.Scanner;

public class IT24100264Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
        float number =scanner.nextFloat();

	String num=(number > 0)? "positive" :(number < 0 )? "nagative" : "zero";

	System.out.println("the number is " + num);
	}
}
	