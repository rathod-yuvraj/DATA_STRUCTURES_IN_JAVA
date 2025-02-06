package Array;

import java.util.Arrays;



public class StringtoArray {

    public static void main(String[] args) {
        int mark[]={90,58,85,89,78,58,51};
        String arr=Arrays.toString(mark);
        System.out.println(arr);
        Arrays.sort(mark);
        System.out.println(Arrays.toString(mark));
    }
    
}
