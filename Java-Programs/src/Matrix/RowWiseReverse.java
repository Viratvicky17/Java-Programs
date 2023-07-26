package Matrix;

import java.util.Scanner;

public class RowWiseReverse {
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
		int[][] rev=Rowwiseeverse(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] Rowwiseeverse(int[][] mat) {
     for (int i = 0; i < mat.length; i++) {
		int f=0,l=mat[i].length-1;
		while(f<l) {
			int temp=mat[i][l];
			mat[i][l]=mat[i][f];
			mat[i][f]=temp;
			f++;
			l--;
		}
	}
		return mat;
	}
}
