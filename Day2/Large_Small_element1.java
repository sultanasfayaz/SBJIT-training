package Day2;

public class Large_Small_element1 {
   public static void main(String[] args) {
	   int arr[]= {12,7,30,3,12,5};
       int largest=arr[0];
       int smallest=arr[0];
       for(int i=1; i<arr.length; i++) {
    	   if(arr[i]>largest) {
    		   largest=arr[i];
    	   }
    	   if(arr[i]<smallest) {
    		   smallest=arr[i];
    	   }
       }
       System.out.println("Largest element:"+largest);
       System.out.println("Smallest element:"+smallest);
     
   }
}
