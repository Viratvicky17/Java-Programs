package SingleArrays;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter" + size + "Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		int[] ans = SortArray(ar);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
			
		}

	}

	private static int[] SortArray(int[] ar) {

		int[] ans = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}

			}

		}

		return ar;
	}

}
