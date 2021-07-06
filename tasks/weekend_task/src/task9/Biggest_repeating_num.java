package task9;

import java.util.Arrays;

public class Biggest_repeating_num {

	public static void main(String[] args) {
		int a[] = { 3, 3, 2, 6, 2, 6, 5, 3, 6, 6, 9 }, c = 1, big = 0, num = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				c++;
			} else {
				c = 1;
			}
			if (c > big) {
				num = a[i + 1];
				big = c;
			}

		}
		System.out.println(num);
	}

}
