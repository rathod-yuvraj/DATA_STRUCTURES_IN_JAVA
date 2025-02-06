package Classes;
public class Primeno {
    // Q4print the prime number
    //Q5 Sum of  the digits
    // input:5436
    // output:18
    // Reverse the given numbers
    // i/p:5436
    // o/p:6345

    // Q  



    public static void main(String[] args) {
        int i,m=0,flag=0;      
  int n=3;    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  
   { System.out.println(n+" is prime number"); }  
  }
}  


    }
    

