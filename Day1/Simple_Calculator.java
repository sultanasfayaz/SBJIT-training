package Day1;

public class Simple_Calculator {
   
   public static int add(int value1, int value2) {
	   
	   return value1+value2;
   }
   public static int subtract(int value1, int value2) {
	   
	   return value1-value2;
   }
   public static int multiply(int value1, int value2) {
	   
	   return value1*value2;
   }
   public static int divide(int value1, int value2) {
	   
	   return value1/value2;
   }
    public static void main(String[] args) {
	   int number1=30;
	   int number2=15;

       System.out.println("Addition: "+add(number1,number2));
       System.out.println("Subtraction: "+subtract(number1,number2));
       System.out.println("Multiplication: "+multiply(number1,number2));
       System.out.println("Division: "+divide(number1,number2));
   }
   
}

