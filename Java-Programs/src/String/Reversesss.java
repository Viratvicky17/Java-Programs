package String;

import java.util.Scanner;

public class Reversesss {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String st=sc.nextLine();
	char[] ch=st.toCharArray();
	String rev="";
	int i=0;
	while(i<ch.length) {
		String str="";
		while(i<ch.length&&ch[i]!=' ') {
			str=str+ch[i];
			i++;
		}
		rev=str+" "+rev;
		i++;
	}
	System.out.println(rev);
}
}
