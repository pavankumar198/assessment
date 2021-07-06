package task6;

public class vowel_in_an_alphabetical_order {

	public static void main(String[] args) {
		String s = "msaehionuf", v = "aeiou";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == v.charAt(0)) {
				if (c == 0) {
					c++;
				} else {
					System.out.println("vowels are not in alphabetical order");
					System.exit(0);
				}

			}
			if (s.charAt(i) == v.charAt(1)) {
				if (c == 1) {
					c++;
				} else {
					System.out.println("vowels are not in alphabetical order");
					System.exit(0);
				}

			}
			if (s.charAt(i) == v.charAt(2)) {
				if (c == 2) {
					c++;
				} else {
					System.out.println("vowels are not in alphabetical order");
					System.exit(0);
				}

			}
			if (s.charAt(i) == v.charAt(3)) {
				if (c == 3) {
					c++;
				} else {
					System.out.println("vowels are not in alphabetical order");
					System.exit(0);
				}

			}
			if (s.charAt(i) == v.charAt(4)) {
				if (c == 4) {
					System.out.println("vowels are in alphabetical order");
				} else {
					System.out.println("vowels are not in alphabetical order");
					System.exit(0);
				}

			}
		}
		if (c == 0) {
			System.out.println("string does not contains any vowels");
		}

	}

}
