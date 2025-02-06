package Classes;

public class Reverseno {
    public static void main(String[] args) {
        
    
    int num= 5436;
    int rev=0;
    // Reverse the digits
    while(num!= 0)   
    {  
        int rem = num % 10;  
        rev = rev * 10 + rem;  
        num = num/10;  
}
System.out.println("The reverse of the given number is: " + rev);  
}  
    
}
