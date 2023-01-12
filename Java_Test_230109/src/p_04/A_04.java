package p_04;

public class A_04 {

	public static void main(String[] args) {

		// 1.다차원 배열 선언 및 메모리 할당

		int[][] arr = new int[5][5];

		int count = 1;

		// 2. 5행5열 다차원 배열에 데이터를 저장해 보자.
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

//				arr[i][j] = count;
//				count++;

				arr[i][j] = count++; // 이렇게 처리하는것도 가능함.

			}

		}

		// 3.다차원 배열을 화면에 출력해 보자.
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();

		}

	}

}
