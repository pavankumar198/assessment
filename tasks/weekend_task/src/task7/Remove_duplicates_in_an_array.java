package task7;

import java.util.Arrays;

public class Remove_duplicates_in_an_array {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 6, 5, 8, 4 };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print(a[a.length - 1]);
	}

}
