package Matrix;

import java.util.Scanner;

public class RowWIseSmall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix Number");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.println("Enter"+row*col+"Elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("User Entered Elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int[] sm=RowwiseSmall(mat);
		for (int i = 0; i < sm.length; i++) {
			System.out.println(sm[i]);
		}
	}

	private static int[] RowwiseSmall(int[][] mat) {
     int[] newArr=new int[mat.length];
     for (int i = 0; i <mat.length; i++) {
		int small=mat[i][0];
		for (int j = 0; j <mat[i].length; j++) {
			if(mat[i][j]<small) {
				small=mat[i][j];
			}
		}
		newArr[i]=small;
	}
		return newArr;
	}
}
