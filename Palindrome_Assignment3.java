package week1.day2;

public class Palindrome_Assignment3 {

	public static void main(String[] args) {
		String Str =  "amma";
		String rev ="";
		int len;
		
		System.out.println("Length of String is " + ( len= Str.length()));
        
		for (int i=len-1; i>=0 ;i--) //i=4
		{
			rev=rev+Str.charAt(i);
			
		}
		System.out.println(rev);
		
		if (Str.equalsIgnoreCase(rev)) {
			System.out.println("Given String " +Str + " is Palindrome");
		}
		else
			System.out.println("Given String is not a Palindrome");
	}

}

/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */