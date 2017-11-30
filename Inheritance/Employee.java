class programmer {
float salary;
 programmer(){ //no arugment constructor
 System.out.println("No arugument constructor in super class");
 this.salary = 3000f;
}
 programmer(float salary){ // arugment constructor
this.salary = salary;
}
void displaySalary(){
System.out.println("Sal->" +salary);
}
}



class Employee extends programmer{
int bonus=1000;

Employee(){
	super(250000); // giving arugments for the superclass constructor
	System.out.println("Emp oubject recated for employee");
}
Employee(float sal){
	super(sal);
	System.out.println("param constuctor for employee");
}
void addBonus(){
	salary = salary+bonus;
}
	void showSalary(){
	System.out.println("Salary with bonus -> "+salary);
	}
	public static void main (String a[]){
	Employee emp= new Employee(45000f);
	System.out.println("employee object in main block");
	emp.displaySalary();
	emp.addBonus();
	emp.showSalary();
}

}