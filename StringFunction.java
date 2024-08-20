package string;

public class StringFunction {

	public static void main(String[] args) {
		String name = "itvedant";
		System.out.println(name.length()); // total characters count 
		System.out.println(name.replace("it","IT")); // it will be replace with IT
		System.out.println(name.contains("edan")); //check mentioned character present in word or not
		System.out.println(name.concat(" vashi")); // append new word at the end of current word
		System.out.println(name.substring(2, 6)); // piece from original word  mention start index, end index 
		System.out.println(name.substring(5)); // mention start index
		System.out.println(name);
		
		
	}	

}
