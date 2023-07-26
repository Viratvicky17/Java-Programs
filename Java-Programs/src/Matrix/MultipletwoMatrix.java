package Matrix;

import java.util.Scanner;

public class MultipletwoMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.println("Enter "+row*col+"Elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
//		
		System.out.println("Enter the Sentence");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int[][] mat1=new int[row1][col1];
		System.out.println("Enter "+row1*col1+"Elements");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("User Entered Elements");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("User Entered Elements");
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] max=isMatrix(mat,mat1);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(max[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] isMatrix(int[][] mat, int[][] mat1) {
   if(mat.length!=mat1[0].length||mat[0].length!=mat1.length) {
		return mat1;
   }
   int[][] newArr=new int[mat.length][mat1[0].length];
   for (int i = 0; i <mat.length; i++) {
	for (int j = 0; j <mat1[0].length; j++) {
		for (int k = 0; k <mat1.length; k++) {
			newArr[i][j]=newArr[i][j]+mat[i][k]*mat1[k][j];
		}
	}
}
   return newArr;
	}

	
}
