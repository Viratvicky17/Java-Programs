package String;

import java.util.Scanner;

public class SmallestWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String st=sc.nextLine();
	int small=st.length();
	String sm="";
	for (int i = 0; i <st.length(); i++) {
		String word="";
		while(i<st.length()&&st.charAt(i)!=' ') {
			word=word+st.charAt(i);
			i++;
		}
		if(word.length()<small) {
			small=word.length();
			sm=word;
		}
	}
	System.out.println(sm);
}
}
