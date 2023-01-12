package p_03;

public class Q_01 {

	public static void main(String[] args) {

		int i = 0;
		int evenSum = 0;
		int oddSum = 0;
		int hap = 0;

		for (i = 1; i <= 100; i++) {

			if ((i % 2) == 0) {

				evenSum -= i;

			} else {

				oddSum += i;

			}

		}

		hap = evenSum + oddSum;

		System.out.println("hap ==> " + hap);

	}

}
