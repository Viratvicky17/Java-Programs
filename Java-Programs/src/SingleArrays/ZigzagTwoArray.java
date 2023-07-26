package SingleArrays;

import java.util.Scanner;

public class ZigzagTwoArray {
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
		int[] zig=ZigZag(ar,ar1);
		for (int i = 0; i < zig.length; i++) {
			System.out.print(zig[i]+" ");
		}
}

	private static int[] ZigZag(int[] a, int[] b) {
      int[] c=new int[a.length+b.length];
      int i=0,k=0;
      while(i<a.length&&i<b.length) {
    	  c[k]=a[i];
    	  k++;
    	  c[k]=b[i];
    	  k++;
    	  i++;
      }
      while(i<a.length) {
    	  c[k]=a[i];
    	  i++;
    	  k++;
      }
      while(i<b.length) {
    	  c[k]=b[i];
    	  i++;
    	  k++;
      }
		return c;
	}
}
