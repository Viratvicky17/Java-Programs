package Matrix;

import java.util.Iterator;
import java.util.Scanner;

public class dimandWiseBiggest {
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
	int[] dim=dimandWiseBig(mat);
	for (int i = 0; i < dim.length; i++) {
		System.out.print(dim[i]+" ");
	}
}

private static int[] dimandWiseBig(int[][] mat) {
    int pbig=mat[0][0],sbig=mat[0][mat.length-1];
    for (int i = 1; i < mat.length; i++) {
		if(mat[i][i]>pbig) {
			pbig=mat[i][i];
		}
		if(mat[i][mat.length-1-i]>sbig) {
			sbig=mat[i][mat.length-1-i];
		}
	}
    int big[]= {pbig,sbig};
	return big;
}
}
