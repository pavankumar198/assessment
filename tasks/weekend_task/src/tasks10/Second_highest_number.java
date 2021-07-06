package tasks10;

import java.util.Arrays;

public class Second_highest_number {

	public static void main(String[] args) {
		int a[] = { 4, 6, 2, 6, 9, 5, 1, 5, 8, 4, 7 }, j = 0;
		Arrays.sort(a);
		int[] s;
		s = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				s[j] = a[i];
				j++;

			}
		}
		int big = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] > big) {
				big = s[i];
			}
		}
		System.out.println(big);

	}

}
