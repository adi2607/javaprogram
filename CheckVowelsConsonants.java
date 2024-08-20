package string;
import java.util.Scanner;

class CheckVowelsConsonants {
	
	static void CheckVowelsConsonant(String sentence){
		int vcount=0,ccount=0;

		
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u') {
				vcount++;
			} 
			else if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z') {
				ccount++;
			}
		}
		System.out.println("Number of Vowels: "+vcount);
		System.out.println("Number of Consonants: "+ccount);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		
		CheckVowelsConsonants.CheckVowelsConsonant(sentence);
		
		sc.close();
	}

}
