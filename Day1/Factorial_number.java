package Day1;

public class Factorial_number {

		public static long factorial(int number)
		{
			long factnumber1=1;
			for(int i=1; i<=number; i++) {
				factnumber1=factnumber1*i;
			}
			return factnumber1;
		}
		 public static void main(String[] args) {

			 int number2=5;
			 long result=factorial(number2);
			 System.out.println("Factorial of "+number2+" is:"+result);
		

	}

}
