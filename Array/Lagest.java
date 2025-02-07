import java.util.Arrays;

class Lagest {
public static int getSecondlargest(int[] arr){
    int n=arr.length;
    Arrays.sort(arr);
    int max=-1 ;
    for(int i=0; i<n;i++){
        if(arr[i]<max){
            max=arr[i];
        }
    }



return max;
}
    public static void main(String[] args) {
        System.out.println("Find the second largest element in an array\n\n");
        int[] arr={56,89,46,25,87,46};
        System.out.println(getSecondlargest(arr));


    }
    
}
