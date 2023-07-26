package SingleArrays;

import java.util.Scanner;

public class BiggestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=sc.nextInt();
	int[] ar=new int[size];
	System.out.println("Enter"+size+"Values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	int big=isBiggest(ar);
	System.out.println(big);
}

private static int isBiggest(int[] ar) {
   int big=ar[0];
   for (int i = 0; i < ar.length; i++) {
	if(ar[i]>big) {
		big=ar[i];
	}
}
	return big;
}
}
