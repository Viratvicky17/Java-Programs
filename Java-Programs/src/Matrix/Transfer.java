package Matrix;

import java.util.Scanner;

public class Transfer {
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
	System.out.println("User Entered Elements");
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	int[][] tran=isTansfer(mat);
	for (int i = 0; i <tran.length; i++) {
		for (int j = 0; j <tran[i].length; j++) {
			System.out.print(tran[i][j]+" ");
		}
		System.out.println();
	}
}

private static int[][] isTansfer(int[][] mat) {
   int[][] newArr=new int[mat[0].length][mat.length];
   for (int i = 0; i <mat.length; i++) {
	for (int j = 0; j <mat[i].length; j++) {
		newArr[j][i]=mat[i][j];
	}
}
	return newArr;
}
}
