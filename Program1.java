package classesandoblects;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		float[] arr = new float[7];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 6; i++) {
			System.out.println("Enter the percentage of student :" + (i + 1));
			arr[i] = scan.nextFloat();
		}
		System.out.println("The percentage of students are:");
		for (int i = 0; i <= 6; i++) {
			System.out.println(arr[i]);
		}

	}

}
