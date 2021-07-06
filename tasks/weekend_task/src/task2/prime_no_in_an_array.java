package task2;

public class prime_no_in_an_array {

	public static void main(String[] args) {
		int a[]= {2,3,11,25};
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (a[i] > 1) {
				for (int j = 1; j <= a[i]; j++) {
					if (a[i] % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.print(a[i] + " ");
				}
			}
		}

	}

}
