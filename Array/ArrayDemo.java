import java.util.Arrays;
import java.util.Scanner;

class ArrayDemo{
    // void getdata(){
    //     int n=10;
    //     for(int i=0;i<n;i++){

    //     }
    // }
    public static void main(String []args){
      
        System.out.println("Create Array");
        int arr[]=new int[10];
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the new value: ");
        for(int i=0; i<arr.length;i++){
             arr[i]=obj.nextInt();
        }
System.out.println("New Array:  "+ Arrays.toString(arr));
    }
}