package Array;

public class ArrDemo {
//     String info[];
//     int   mark[];
//     String[] name=new String[10];
//    // int[] rollNo=new int[5];
//     //String[] chiles={"jalapeno","senoro" }
//      info[1]="apple";
//      int len=chiles.length;
//      int len2=info.length;
    public static void main(String[] args) {
        int mark[]={2001,2,3,4,5,6,7,25,15,16,18,14,251};
        for(int i=0; i<mark.length;i++){
            // System.out.print("[");
            // System.out.print(mark[i]);
            // System.out.print("]");

            System.out.println(" The list of Mark "+i+":"+mark[i]);
            
            
        }
        mark[2]=90;
        System.out.print(mark[2]);
        
    }
    
}
