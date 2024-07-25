package Java;

public class bitwise {
    public static void main(String[] args) {
        // Declaring and initializing integer variable
        // to be checked
        int n = 100;
 
        // Condition check
        // if n|1 if greater than n then this number is even
        if ((n | 1) > n) {
 
            // Print statement
            System.out.println("Number is Even "+n);
        }
        else {
 
            // Print statement
            System.out.println("Number is Odd "+n);
        }
    }
    
}
