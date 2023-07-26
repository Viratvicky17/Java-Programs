package SingleArrays;

import java.util.Scanner;

public class SwapArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("Enter"+size+"Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
	  int[] arr=reverse(ar);
	  for (int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");		
	}
	}

	private static int[] reverse(int[] ar) {
		
			int i=0,j=ar.length-1;
			while(i<j) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
				j--;
			}
		

		return ar;
	}
	}
