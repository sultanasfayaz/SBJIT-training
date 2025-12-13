package day4;

abstract class Employee5 {
	protected String name;
    protected int employeeId;
    
    public Employee5(String name, int employeeId) {
    	this.name=name;
    	this.employeeId=employeeId;
    }
    
    public abstract double calculateSalary();
    
    public void displayInfo() {
    	System.out.println("ID:"+employeeId+"\nName:"+name);
    }
}

