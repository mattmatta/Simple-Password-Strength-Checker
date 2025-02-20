package CS3090;

import java.util.Scanner;

public class StrengthTester {

	public static void main(String[] args) {
		String[] numbers = new String[10];
		for (int i = 0; i < 10; i++)
			numbers[i] = String.valueOf(i);

		String[] specials = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+" };
		System.out.println("Enter your password for strength test: ");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		int letterCount = 0;
		int numberCount = 0;
		int specialCount = 0;

		// Loop through the password to check the character types
		for (int i = 0; i < password.length(); i++) {
			char currentChar = password.charAt(i);

			if (Character.isLetter(currentChar))
				letterCount++;

			else if (Character.isDigit(currentChar))
				numberCount++;

			else if (isSpecialChar(currentChar, specials))
				specialCount++;
		}

		// Output the password strength
		String strength = evaluatePasswordStrength(letterCount, numberCount, specialCount, password.length());
		System.out.println("Password strength: " + strength);
		sc.close();
	}

	// Method to check if a character is a special character
	private static boolean isSpecialChar(char c, String[] specials) {
		for (String special : specials) {
			if (special.charAt(0) == c) 
				return true;
		}
		return false;
	}

	// Method to evaluate password strength based on counts of character types
	private static String evaluatePasswordStrength(int letterCount, int numberCount, int specialCount,
			int passwordLength) {
		if (passwordLength >= 8 && letterCount > 0 && numberCount > 0 && specialCount > 0)
			return "Strong";
		else if (passwordLength >= 6 && ((letterCount > 0 && numberCount > 0) || (letterCount > 0 && specialCount > 0)))
			return "Moderate";
		else
			return "Weak";

	}

}
