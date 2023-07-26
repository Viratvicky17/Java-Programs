package SingleArrays;

import java.util.Scanner;

public class insert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("Enter"+size+"Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		
		int[] ans=delete(ar,3);
		for (int i = 0; i < ans.length; i++) {
		System.out.print(ans[i]+ " ");	
		}

}

	private static int[] delete(int[] ar, int in) {
		int[] ans=new int[ar.length-1];
		for(int i=0;i<ans.length;i++) {
			
			if(i<in) {
				ans[i]=ar[i];
			}
			else {
				ans[i]=ar[i+1];
			}
			
		}
		
		
		
		return ans;
	}

	private static int[] insert(int[] ar, int in, int ele) {
		int[] ans=new int[ar.length+1];
		for(int i=0;i<ar.length;i++) {
			ans[in]=ele;
			if(i<in) {
				ans[i]=ar[i];
			}
			else {
				ans[i+1]=ar[i];
			}
			
		}
		return ans;	
	}
	
	}
