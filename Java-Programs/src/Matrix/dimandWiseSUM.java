package Matrix;

import java.util.Scanner;

public class dimandWiseSUM {
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
		int[] sm=dimandSUm(mat);
		for (int i = 0; i < sm.length; i++) {
			System.out.print(sm[i]+" ");
		}
}

	private static int[] dimandSUm(int[][] mat) {
    int psum=mat[0][0],ssum=mat[0][mat.length-1];
    for (int i = 1; i < mat.length; i++) {
		psum=psum+mat[i][i];
		ssum=ssum+mat[i][mat[i].length-1-i];
	}
    int[] sum= {psum,ssum};
		return sum;
	}
}
