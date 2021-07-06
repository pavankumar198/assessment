package task8;

import java.util.Arrays;

public class Remove_duplicate_from_an_string {

	public static void main(String[] args) {
		String s = "hi my name is sannidhi pavan kumar";
		s = s.replace(" ", "");
		StringBuilder sb = new StringBuilder();
		char a[] = s.toCharArray();
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));
		System.out.println();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				sb.append(a[i]);
			}
		}
		sb.append(a[a.length - 1]);
		System.out.print(sb);
	}

}
