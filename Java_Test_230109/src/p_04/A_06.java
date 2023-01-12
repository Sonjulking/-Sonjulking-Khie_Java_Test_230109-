package p_04;

//다차원 배열의 가변 배열을 이용하자.

public class A_06 {

	public static void main(String[] args) {

		int[][] arr = new int[5][];

		int count = 1;

		// 가변 배열의 열을 생성해 주자.

//		arr[0] = new int[1];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		arr[3] = new int[4];
//		arr[4] = new int[5];

		// =>반복문을 사용해주자.

		for (int i = 0; i < arr.length; i++) {

			arr[i] = new int[i + 1];

		}

		// 가변 배열에 데이터를 저장해 주자!

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = count++;

			}

		}

		// 가변 배열에 저장된 데이터를 화면에 출력해보자.

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();

		}

	}

}
