package SingleArrays;

import java.util.Scanner;

public class SumofArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int size=sc.nextInt();
	int[] ar=new int[size];
	System.out.println("Enter"+size+"Values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	int sm=sumOfArray(ar);
	System.out.println(sm);
}

private static int sumOfArray(int[] ar) {
    int sum=0;
    for (int i = 0; i < ar.length; i++) {
		sum=sum+ar[i];
	}
	return sum;
}
}
