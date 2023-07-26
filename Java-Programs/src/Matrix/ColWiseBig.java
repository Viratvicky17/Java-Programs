package Matrix;

import java.util.Scanner;

public class ColWiseBig {
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
		int[] big=isColwiseBig(mat);
		for (int i = 0; i < big.length; i++) {
			System.out.println(big[i]);
		}
	}

	private static int[] isColwiseBig(int[][] mat) {
    int[] newArr=new int[mat[0].length];
    for (int i = 0; i <mat[0].length; i++) {
		int big=mat[0][i];
		for (int j = 0; j <mat.length; j++) {
			if(mat[j][i]>big) {
				big=mat[j][i];
			}
		}
		newArr[i]=big;
	}
		return newArr;
	}
}
