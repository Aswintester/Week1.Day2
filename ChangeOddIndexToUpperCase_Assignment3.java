package week1.day2;

public class ChangeOddIndexToUpperCase_Assignment3 {

	public static void main(String[] args) {
		 String test = "changeme";
		 int n = test.length();
		 System.out.println("length of the string is : " + n);
		char[] chararray = test.toCharArray();
		//System.out.println(chararray);
		 for (int i=0; i<n; i++) {
			 if(i % 2 != 0) {
			 	 System.out.print(Character.toUpperCase(chararray[i]));
			 }
			 	 else
			 	 {
			 		System.out.print(chararray[i]);
			 	 }
			 
			 }
			 
		 }

	}





/*
 Pseudo Code
 
 * Declare String Input as Follow
  
 * String test = "changeme";
 
 * a) Convert the String to character array
 
 * b) Traverse through each character (using loop)
 
 * c)find the odd index within the loop (use mod operator)
 
 * d)within the loop, change the character to uppercase, if the index is odd else don't change
  
 */