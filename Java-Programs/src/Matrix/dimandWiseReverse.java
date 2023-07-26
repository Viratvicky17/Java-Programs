package Matrix;

import java.util.Scanner;

public class dimandWiseReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix Number");
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
		int[][] rv=dimandWiserev(mat);
		for (int i = 0; i < rv.length; i++) {
			for (int j = 0; j < rv[i].length; j++) {
				System.out.print(rv[i]+" ");
			}
		}
	}

	private static int[][] dimandWiserev(int[][] mat) {
       for (int i = 0; i < mat.length/2; i++) {
		int temp=mat[i][i];
		mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
		mat[mat.length-1-i][mat.length-1-i]=temp;
		temp=mat[i][mat.length-1-i];
		mat[i][mat.length-1-i]=mat[mat.length-1-i][i];
		mat[mat.length-1-i][i]=temp;
	}
		return mat;
	}
}
