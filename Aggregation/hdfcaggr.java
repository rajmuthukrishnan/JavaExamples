class hdfcaggr {

String name;
String branch;
address addr;

// Parameterized contructor

hdfcaggr(String name, String branch, address addr){
this.name = name;
this.branch = branch;
this.addr = addr;
}

//Method
	void displayDetails(){
	System.out.println ("Bank Name   :"+name + "Branch Name   :"+branch);   
	addr.showDetails();

}

}


