package Day1;

public class variable_demo {
    static String college="VTU";
    public void getData(String name,String college) {
    	System.out.println(name+"-"+college);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable_demo variable1=new variable_demo();
		variable1.getData("Neha",college);
		variable_demo variable2=new variable_demo();
		variable2.getData("Sultana", college);
		
	}
}