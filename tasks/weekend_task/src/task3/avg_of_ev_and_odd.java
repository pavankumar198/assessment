package task3;

public class avg_of_ev_and_odd {

	public static void main(String[] args) {
		int a[] = { 2, 3, 1, 456 }, evsum = 0, odsum = 0, even = 0, odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evsum = evsum + a[i];
				even++;

			} else {
				odsum = odsum + a[i];
				odd++;
			}
		}
		double avgev = evsum / even;
		double avgod = odsum / odd;
		System.out.println("avg of odd=" + avgod);
		System.out.println("avg of even=" + avgev);
	}

}
