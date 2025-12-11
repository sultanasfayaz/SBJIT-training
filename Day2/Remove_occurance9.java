package Day2;

public class Remove_occurance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers= {3,2,8,2,3,8,1,2};
        int element=3;
        int count=0;
        for(int number:numbers) {
        	if(number==element) {
        		count++;
        	}
        }
        int[] newNumber=new int[numbers.length-count];
        int index=0;
        for(int number:numbers) {
        	if(number!=element) {
        		newNumber[index++]=number;
        	}
        }
        System.out.println("Array after removing"+element+":");
        for(int values:newNumber) {
        	System.out.print(values+" ");
        }
	}

}
