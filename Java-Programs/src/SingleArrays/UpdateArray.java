package SingleArrays;

import java.util.Scanner;

public class UpdateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("Enter"+size+"Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int[] up=UpdateArray(ar);
		for (int i = 0; i < up.length; i++) {
			System.out.println(up[i]);
		}
	}

	private static int[] UpdateArray(int[] ar) {
      for (int i = 0; i < ar.length; i++) {
		int sum=0,v=ar[i];
		while(v!=0) {
			sum=sum+v%10;
			v=v/10;
		}
		ar[i]=sum;
	}
		return ar;
	}
}
