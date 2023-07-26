package Matrix;

import java.util.Scanner;

public class colWiseReverse {
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
//		int[][] rev=colwiseReverse(mat);
//		for (int i = 0; i < rev.length; i++) {
//			for (int j = 0; j < rev[i].length; j++) {
//				System.out.print(rev[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

//	private static int[][] colwiseReverse(int[][] mat) {
//		int[][] rev=new int[mat.length][mat[0].length];
//		
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				rev[j][i]=mat[i][j];
//			}
//			
//		}
//		
//    
//		return rev;
//	}
}
