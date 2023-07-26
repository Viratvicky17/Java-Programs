package String;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String st1=sc.nextLine();
	String st2=sc.nextLine();
	int[] arr1=isFequency(st1);
	int[] arr2=isFequency(st2);
	boolean rs=isAnagram(arr1,arr2);
	if(rs)
		System.out.println("Is a Anagram");
	else
		System.out.println("Not a Anagram");
}

private static boolean isAnagram(int[] arr1, int[] arr2) {
for (int i = 0; i < arr2.length; i++) {
	if(arr1[i]!=arr2[i]) {
		return false;
	}
}
	return true;
}

private static int[] isFequency(String st1) {
char[] ch=st1.toCharArray();
int[] arr=new int[26];
for (int i = 0; i <ch.length; i++) {
	if(ch[i]>='a'&&ch[i]<='z') {
		arr[ch[i]-97]++;
	}
	else if(ch[i]>='A'&&ch[i]<='Z') {
		
		arr[ch[i]-65]++;
	}
}
	return arr;
}
}
