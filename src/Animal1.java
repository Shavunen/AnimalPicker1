
import java.util.Scanner;

public class animal1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner question = new Scanner(System.in);

		System.out.println("Would you like to see a cat or a dog?");

		String answer = question.nextLine();

		if (answer.equalsIgnoreCase("cat")) {
			System.out.println("“CAT ASCII ART HERE");

		} else if (answer.equalsIgnoreCase("dog")) {
			System.out.println("“DOG ASCII ART HERE");
}
	}
}