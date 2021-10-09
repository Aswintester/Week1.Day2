package week1.day2;

public class CharOccurance_Assignment3 {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char search = 'e';
        int count =0;
        char [] MyArray = str.toCharArray();
        int l=  MyArray.length;
        for (int i=0; i<l ;i++) {
        	
			if (MyArray[i]== search) {
        		count++;
        	}
			System.out.println("The Character '"+search+"' appears "+count+" times.");
		
        }
        
	}
}	

//Check number of occurrences of a char (eg 'e') in a String

			//String str = "welcome to chennai";

			// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
					
	
