package String;

import java.util.Scanner;

public class Panagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String st=sc.nextLine();
	boolean rs=isPanagram(st);
	if(rs)
		System.out.println("Is a Panagram");
	else
		System.out.println("Not a panagam");
}

private static boolean isPanagram(String st) {
char[] ch=st.toCharArray();
int[] arr=new int[26];
for (int i = 0; i <ch.length; i++) {
	if(ch[i]>='a'&&ch[i]<='z') {
		arr[ch[i]-97]++;
	}
	else if(ch[i]>='A'&&ch[i]<='Z') {
		arr[ch[i]-65]++;
	}
}
for (int i = 0; i < arr.length; i++) {
	if(arr[i]==0) {
		return false;
	}
}
	return true;
}
}
