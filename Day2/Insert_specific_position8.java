package Day2;

public class Insert_specific_position8 {
   public static void main(String[] args) {
	   int[] numbers= {11,22,33,44,66,77};
	   int element=99;
	   int position=3;
	   int[] numbers1=new int[numbers.length+1];
	   
	   for(int i=0; i<position; i++) {
		   numbers1[i]=numbers[i];
	   }
	   numbers1[position]=element;
	   for(int i=position; i<numbers.length; i++) {
		   numbers1[i+1]=numbers[i];
	   }
	   System.out.println("Array after insertion");
	   for(int x:numbers1) {
		   System.out.println(x+" ");
	   }
   }
}
