package Day1;

class Overloading {
	int add(int number1, int number2) {
		return number1+number2;
	}
	int add(int number1, int number2, int number3) {
		return number1+number2+number3;
	}
	double add(double number1, double number2) {
		return number1+number2;
	}
}
public class MethodOverloading10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Overloading overloading = new Overloading();
       System.out.println("add(int, int):"+overloading.add(10, 20));
       System.out.println("add(int, int, int):"+overloading.add(10, 20, 30));
       System.out.println("add(double, double):"+overloading.add(5.5, 6.5));
       
	}

}
