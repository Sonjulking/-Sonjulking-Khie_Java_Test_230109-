package p_04;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int numberOfStudents = sc.nextInt();

		String[] stundentName = new String[numberOfStudents];
		int[] korScore = new int[numberOfStudents];
		int[] engScore = new int[numberOfStudents];
		int[] mathScore = new int[numberOfStudents];

		int i = 0;

		for (i = 0; i < numberOfStudents; i++) {

			System.out.print("이름 입력 : ");
			stundentName[i] = sc.next();
			System.out.print("국어점수 입력 : ");
			korScore[i] = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			engScore[i] = sc.nextInt();
			System.out.print("수학점수 입력 : ");
			mathScore[i] = sc.nextInt();

			if (i >= numberOfStudents - 1) {
				sc.close();
			}

		}

		int[] totalScore = new int[numberOfStudents];

		for (i = 0; i < numberOfStudents; i++) {

			totalScore[i] = korScore[i] + engScore[i] + mathScore[i];

		}

		float[] averageScore = new float[numberOfStudents];

		for (i = 0; i < numberOfStudents; i++) {

			averageScore[i] = (float) totalScore[i] / (float) 3;

		}

		char[] grade = new char[numberOfStudents];

		for (i = 0; i < numberOfStudents; i++) {

			if (averageScore[i] >= 90) {
				grade[i] = 'A';
			} else if (averageScore[i] >= 80) {
				grade[i] = 'B';
			} else if (averageScore[i] >= 70) {
				grade[i] = 'C';
			} else if (averageScore[i] >= 60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}

		}

//		float temp = 0;
//		int[] rank = new int[numberOfStudents];
//		
//		for (i = 0; i < numberOfStudents; i++) {
//			for (int j = i + 1; j < numberOfStudents; j++) {
//
//				if (averageScore[i] < averageScore[j]) {
//
//					temp = averageScore[i];
//					averageScore[i] = averageScore[j];
//					averageScore[j] = temp;
//
//				}
//
//			}
//		}
//		
		int[] rank = new int[numberOfStudents];

		for (i = 0; i < numberOfStudents; i++) {

			rank[i] = 1;

			for (int j = 0; j < numberOfStudents; j++) {
				if (averageScore[i] < averageScore[j]) {

					rank[i] = rank[i] + 1;

				}
			}

		}

		for (i = 0; i < numberOfStudents; i++) {

			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			System.out.print("이름 : " + stundentName[i] + "\t ");
			System.out.print("총점 : " + totalScore[i] + "점\t");
			System.out.printf("평균 : %.2f점\t", averageScore[i]);
			System.out.print("학점 : " + grade[i] + "학점\t");
			System.out.println("순위 : " + rank[i] + "등");
			System.out.println();

		}

	}
}
