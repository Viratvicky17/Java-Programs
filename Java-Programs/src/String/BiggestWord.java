package String;

import java.util.Scanner;

public class BiggestWord {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Sentence");
	 String st=sc.nextLine();
	 String big="";
	 for (int i = 0; i <st.length(); i++) {
		String word="";
		while(i<st.length()&&st.charAt(i)!=' ') {
			word=word+st.charAt(i);
			i++;
		}
		if(word.length()>big.length()) {
			big=word;
		}
	}
	 System.out.println(big);
			 
}
}
