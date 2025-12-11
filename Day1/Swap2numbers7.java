package Day1;

public class Swap2numbers7 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int number1=10;
	   int number2=20;
	   System.out.println("Before Swaping");
	   System.out.println("number1:"+number1+",number2:"+number2);
	   int temp=number1;
	   number1=number2;
	   number2=temp;
	   System.out.println("After Swaping");
	   System.out.println("number1:"+number1+",number2:"+number2);
       
	   System.out.println("Before Swaping");
	   System.out.println("number1:"+number1+",number2:"+number2);
       number1=number1+number2;
       number2=number1-number2;
       number1=number1-number2;
       System.out.println("After Swaping");
	   System.out.println("number1:"+number1+",number2:"+number2);
       
	}

}
