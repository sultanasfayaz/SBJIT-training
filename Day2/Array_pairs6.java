package Day2;

public class Array_pairs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] values= {2,4,3,5,7,8,9};
        int sum=7;
        System.out.println("Pairs with sum"+sum+"are:");
        for(int i=0; i<values.length; i++) {
        	for(int j=i+1; j<values.length; j++) {
        		if(values[i]+values[j]==sum) {
        			System.out.println(values[i]+"+"+values[j]+"="+sum);
        		
        		}
        	}
        }
	}
}
