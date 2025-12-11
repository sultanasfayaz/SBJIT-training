package Day2;

public class Frequency_count5 {
   public static void main(String[] args) {
	   int[] numbers= {10,20,20,30,30,30,50};
	   int visited=-1;
	   int[] frequency=new int[numbers.length];
	   for(int i=0; i<numbers.length; i++) {
		   int count=1;
		   for(int j=i+1; j<numbers.length; j++) {
			   if(numbers[i]==numbers[j]) {
				   count++;
				   frequency[j]=visited;
		       }   
		   }
		   if(frequency[i]!=visited) {
			   frequency[i]=count;
		   }
	   }
	   System.out.println("Element | Frequency");
	   for(int i=0; i<numbers.length; i++) {
		   if(frequency[i]!=visited) {
			   System.out.println(numbers[i]+"   "+frequency[i]);
		   }
	   }
	   
   }
}
