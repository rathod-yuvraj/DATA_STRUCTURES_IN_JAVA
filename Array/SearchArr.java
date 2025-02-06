import java.util.Scanner;

public class SearchArr {
    static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return key; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better formatting
        
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        
        int result = search(arr, key);
        if (result != -1) {
            System.out.println("Element found : " + result);
        } else {
            System.out.println("Element not found.");
        }
        
        sc.close(); // Close the scanner
    }
}
