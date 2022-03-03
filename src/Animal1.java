
import java.util.Scanner;

public class animal1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner question = new Scanner(System.in);

		System.out.println("Would you like to see a cat, dog, or fish?");

		String answer = question.nextLine();

		if (answer.equalsIgnoreCase("cat")) {
			System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n    ");

		} else if (answer.equalsIgnoreCase("dog")) {
			System.out.println(" \\ ______/ V`-,\n  }        /~~\n /_)^ --,r\'\n|b      |b");

			System.out.println(" \\ ______/ V`-,\n  }        /~~\n /_)^ --,r\'\n|b      |b");

		} else if (answer.equalsIgnoreCase("fish")) {
			System.out.println(" ;,//;,    ,;/\n o:::::::;;///\n>::::::::;;\\\\\\\n  \'\'\\\\\\\\\\\'\" \';\\");

		} else {
			System.out.println("This is not a valid response!!");

			boolean running = true;
			while (running) {
				System.out.println("Would you like to see a cat, dog, or fish?");

				{
					running = false;

				}
			}
		}
	}
}