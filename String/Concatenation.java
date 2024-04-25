// Importing required classes 
//import java.io.*;



public class Concatenation {
    
    // Java Program to Illustrate to Find a Character 
// in the String 

 




	// Main driver method 
	public static void main(String[] args) 
	{ 
        
        String st="yuvraj Rathod isaaa";
        int SIndx=st.indexOf('a');
        int S=st.indexOf("t");
        System.out.println("Second occurrence of char 't'"+"is found at:"+S);
        System.out.println("Second occurrence of char 'a'"+"is found at:"+SIndx);
        //int Second_in = st.indexOf('a', 10);
        //String second
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
		String str = "GeeksforGeeks is a computer science portal"; 
		int firstIndex = str.indexOf('s'); 
		System.out.println("First occurrence of char 's'"+ " is found at : "+ firstIndex); 
		int lastIndex = str.lastIndexOf('s'); 
		System.out.println("Last occurrence of char 's' is"+ " found at : " + lastIndex); 
		int first_in = str.indexOf('s', 10); 
		System.out.println("First occurrence of char 's'"+ " after index 10 : "+ first_in); 
		int last_in = str.lastIndexOf('s', 20); 
		System.out.println("Last occurrence of char 's'"+ " after index 20 is : "+ last_in); 
		int char_at = str.charAt(20); 
		System.out.println("Character at location 20: "+ char_at); 

		// Note: If we uncomment it will throw 
		// StringIndexOutOfBoundsException 
		// char_at = str.charAt(50); 
	} 
}


