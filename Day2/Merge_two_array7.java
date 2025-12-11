package Day2;

public class Merge_two_array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] number1= {1,2,3,4};
       int[] number2= {5,6,7,8};
       int[] merge=new int[number1.length+number2.length];
       
       for(int i=0; i<number1.length; i++) {
    	  merge[i]=number1[i];
       }
       for(int i=0; i<number2.length; i++) {
    	   merge[number1.length+i]=number2[i];
       }
       System.out.println("Merged array");
       for(int number:merge) {
    	   System.out.println(number+"");
       }
		
	}

}
