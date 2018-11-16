/*
    Aufgabe 2) Neugestaltung von Spaghetti-Code durch Methoden
*/
public class Aufgabe2 {

	public static void main(String[] args) {

		String text1 = "Have a great day!";

		printTextWithSeparator(text1, '-');

		printNumberWithSeparator(35061, '*');
		System.out.println();
		
		printTextWithSeparator("This is a Teststring", '.');
		System.out.println();
		String separators = "#.+";
		for (int i = 0; i < separators.length(); i++) {
			printTextWithSeparator(text1, separators.charAt(i));
		}

		printNumberWithSeparator(1010, '#');
		System.out.println();
	}

	private static void printNumberWithSeparator(int num2, char hash) {
		int dec = 1;
		int numDigits = 0;
		while (num2 > dec) {
			dec *= 10;
			numDigits += 1;
		}
		dec = dec / 10;
		while (num2 > 0) {
			numDigits--;
			System.out.print(num2 / dec);
			num2 = num2 % dec;
			if (num2 > 0) {
				System.out.print(hash);
			} else if (numDigits > 0) {
				System.out.print(hash);
				System.out.println('0');
			}
			dec /= 10;
		}
	}

	private static void printTextWithSeparator(String text1, char separator) {
		for (int i = 0; i < text1.length() - 1; i++) {
			System.out.print(text1.charAt(i));
			System.out.print(separator);
		}
		printlnLastChar(text1);
	}

	private static void printlnLastChar(String text1) {
		System.out.println(text1.charAt(text1.length() - 1));
	}

	// TODO: Implementieren Sie hier Ihre Methoden
}
