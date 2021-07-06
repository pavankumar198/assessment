package task4;

public class Print_char_in_uppercse_which_are_in_prime_index_position {

	public static void main(String[] args) {
		String a[] = { "hi", "my", "name", "is", "pavan", "kumar", "sannidhi", "thank", "you" };
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(a[i].toUpperCase() + " ");
			} else {
				System.out.print(a[i] + " ");
			}
		}
	}

}
