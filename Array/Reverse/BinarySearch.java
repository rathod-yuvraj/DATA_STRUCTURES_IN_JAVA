public class BinarySearch {
    private static final int NOT_FOUND = 0;
    public  static  int binarySearch( int arr  [ ] ,int x )
        {
        int low = 0, high = arr.length- 1;
             while( low <= high )
         {
         int mid = ( low +high ) / 2;
        
         if( arr[ mid ].compareTo( x ) < 0 )
         low = mid + 1;
         else if( arr[ mid ].compareTo( x) > 0 )
         high = mid- 1;
         else
         return mid; // Found
         }
         return NOT_FOUND; // NOT_FOUND is defined as-1
     }
     public static void main(String[] args) {
        int[] arr={23,54,76,89,96,12};
        binarySearch(arr,34);
        
     }
}
