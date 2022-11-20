package assignment_4;

public class Palindrome2552 {

	public static void main(String[] args) {

		String S1 = "2552";

		char[] ar1 = S1.toCharArray();

		int k = ar1.length;
		int j = 0;

		char[] ar2 = new char[k];

		for (int i = (k - 1); i >= 0; i--) {

			ar2[j] = ar1[i];
			j++;
		}

		int Count = 0;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == ar2[i]) {

				Count++;

			}

		}
		if (Count == (ar1.length)) {
			System.out.println("Its a palindrome");
		}

		else
			System.out.println("Its not a palindrome");

	}

}
