package p_04;

public class Q_04 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();

		}

	}

}
