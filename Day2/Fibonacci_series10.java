package Day2;

public class Fibonacci_series10 {
    public static void main(String[] args) {
    	int number=10;
    	int value1=0;
    	int value2=1;
    	System.out.print("Fibonacci Series "+value1+" "+value2);
    	for(int i=2; i<number; i++) {
    		int value3=value1+value2;
    		System.out.print(" "+value3);
    		value1=value2;
    		value2=value3;
    	}
    }
}
