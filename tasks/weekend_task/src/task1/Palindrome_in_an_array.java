package task1;

public class Palindrome_in_an_array {
	public static void main(String[] args) {
		int a[] = { 121, 345, 12349, 98789, 2 }, r, rev = 0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			rev = 0;
			while (n > 0) {
				r = n % 10;
				rev = (rev * 10) + r;
				n = n / 10;
			}
			if (rev == a[i]) {
				System.out.print(rev + " ");
			}

		}

	}

}
