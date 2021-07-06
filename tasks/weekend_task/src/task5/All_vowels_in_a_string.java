package task5;

public class All_vowels_in_a_string {

	public static void main(String[] args) {
		String s = "education", v = "aeiou";
		int a, e, i, o, u;
		a = e = i = o = u = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == v.charAt(0)) {
				a++;
			}
			if (s.charAt(j) == v.charAt(1)) {
				e++;
			}
			if (s.charAt(j) == v.charAt(2)) {
				i++;
			}
			if (s.charAt(j) == v.charAt(3)) {
				o++;
			}
			if (s.charAt(j) == v.charAt(4)) {
				u++;
			}
		}
		if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0) {
			System.out.println(s + " has all vowels");
		} else {
			System.out.println(s + " doesnt contains the all vowels");
		}
	}

}
