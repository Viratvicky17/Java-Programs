package SingleArrays;

import java.util.Scanner;

public class PrimeorNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int size=sc.nextInt();
	int[] ar=new int[size];
	System.out.println("Enter"+size+"Values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	boolean rs=isPrime(ar);
}

private static boolean isPrime(int[] n) {
//  for (int i = 2; i<=n; i++) {
//	  if(n%i==0) {
//		  c++;
//	  }
//	
//}
	return false;
}
}
