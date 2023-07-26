package SingleArrays;

import java.util.Scanner;

public class JoinTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("Enter"+size+"Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of Array");
		int size1=sc.nextInt();
		int[] ar1=new int[size1];
		System.out.println("Enter"+size1+"Values");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i]=sc.nextInt();
		}
		int[] jn=JoinTwoArray(ar,ar1);
		for (int i = 0; i < jn.length; i++) {
			
			System.out.print(jn[i]);
		}
}

	private static int[] JoinTwoArray(int[] a,int[] b) {
   int[] c=new int[a.length+b.length];
   for (int i = 0; i < a.length; i++) {
	c[i]=a[i];
}
   for (int i = 0; i < b.length; i++) {
	c[i+a.length]=b[i];
}
		return c;
	}
}
