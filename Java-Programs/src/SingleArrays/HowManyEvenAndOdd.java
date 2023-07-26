package SingleArrays;

import java.util.Scanner;

public class HowManyEvenAndOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an  Array");
	int size=sc.nextInt();
	int[] ar=new int[size];
	System.out.println("Enter"+size+"Values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
		
	}
	int[] eo=EvenAndOdd(ar);
	System.out.println(eo[0]);
	System.out.println(eo[1]);
}

private static int[] EvenAndOdd(int[] ar) {
int en=0,on=0;
for (int i = 0; i < ar.length; i++) {
	if(ar[i]%2==0) {
		en++;
	}
	else {
		on++;
	}
}
int[] count= {en,on};
	return count;
}
}
