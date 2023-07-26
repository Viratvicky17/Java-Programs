package SingleArrays;

import java.util.Scanner;

public class SmallestDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int size=sc.nextInt();
	int[] ar=new int[size];
	System.out.println("Enter"+size+"Values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	int sm=isSmallest(ar);
	System.out.println(sm);
}

private static int isSmallest(int[] ar) {
int small=ar[0];
for (int i = 0; i < ar.length; i++) {
	if(ar[i]<small) {
		small=ar[i];
	}
}
	return small;
}
}
