import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String dString = scanner.nextLine();
		boolean f = UserMainCode.validateDate(dString);
		if (f) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
}