import java.util.Scanner;

public class Input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valid;
		do {
			System.out.println("enter the score");
			int score = sc.nextInt();
			String grade = "";
			if (score >= 95) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else 
				grade="F";
			System.out.println("grade " + grade);
			System.out.println("do you wan to continue y/n?");
			char input =sc.next().charAt(0);

			if ('y' == input) {
				valid = true;
			} else {
				valid = false;
				System.out.println("thank you");
			}
		} while (valid);

	}

}
