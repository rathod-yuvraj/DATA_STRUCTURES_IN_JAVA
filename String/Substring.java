
public class Substring {
	public static void main(String[] args) 
	{  System.out.println("\n\n************************************************************");
    String ystring="yuvraj isgreader greater then amaru";
    int sub=ystring.indexOf("u");
    System.out.println("yuvraj is sub string : "+sub);
    int que=ystring.lastIndexOf("u");
    System.out.println("Second the last word : " + que);

    System.out.println("\n\n************************************************************");
    System.out.println("\n\n************************************************************");
		String str = "GeeksforGeeks is a computer science portal"; 
		int firstIndex = str.indexOf("Geeks"); 
		System.out.println("First occurrence of char Geeks"+ " is found at : "+ firstIndex); 
		int lastIndex = str.lastIndexOf("Geeks"); 
		System.out.println( "Last occurrence of char Geeks is"+ " found at : " + lastIndex); 
		int first_in = str.indexOf("Geeks", 10); 
		System.out.println("First occurrence of char Geeks"+ " after index 10 : "+ first_in); 
		int last_in = str.lastIndexOf("Geeks", 20); 
		System.out.println("Last occurrence of char Geeks "+ "after index 20 is : "+ last_in); 
        System.out.println("\n\n************************************************************");
            
	} 
}

    

