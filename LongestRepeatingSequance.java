package string;

import java.util.Scanner;

public class LongestRepeatingSequance {
	
	static String checkString(String s,String t) {
		// to check for longest common prefix
		int n = Math.min(s.length(), t.length());
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return s.substring(0,i);
			}
		}
		return s.substring(0,n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		String newstr = "";
		int n = str.length();
		
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<n;j++) {
				String a = checkString(str.substring(i,n),str.substring(j,n)); // checks for common factors in every substring
				// if current prefix is greater than previous one then it takes current one as longest repeating string 
				if(a.length()>newstr.length())newstr=a;
			}
		}
		System.out.println("Longest Repeating String: "+ newstr);
		
		sc.close();
	}

}
