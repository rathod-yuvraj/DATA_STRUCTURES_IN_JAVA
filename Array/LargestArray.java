package Array;

public class LargestArray {
    public static void LargestNo(int arr[]){
        if(arr==null ||arr.length==0){
            System.out.println("Array is Empty");
        }
        int min=arr[0];
        int max=arr[0];

        for(int num : arr){
            if(num<min){
                min=num;
            }
            else if(num>max){
                max=num;
            }
        }
        System.out.println("Smallest number of the Array: "+min);
        System.out.println("Largest number in the Array: "+max);
    }


    public static void main(String[] args) {
        System.out.println("\n\n Find the largest and smallest element in an array\t\n");
        int[] arr={56,59,12,15,88,79,46,35};


        LargestNo(arr);
    }
    
}
