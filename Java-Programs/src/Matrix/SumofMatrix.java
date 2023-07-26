package Matrix;

import java.util.Scanner;

public class SumofMatrix {
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
	int sm=isSumofMatrix(mat);
	System.out.println(sm);
}

private static int isSumofMatrix(int[][] mat) {
int sum=0;
for (int i = 0; i < mat.length; i++) {
	for (int j = 0; j < mat[i].length; j++) {
		sum=sum+mat[i][j];
	}
}
	return sum;
}
}
