class testhdfc {

public static void main (String args[]){

address addr = new address("Velachery", "Chennai", "TN");
address addr1 = new address("TNagar","Chennai", "TN");
hdfcaggr hdfc = new hdfcaggr("HDFC","Velachery Branch",addr);
hdfcaggr hdfc1 = new hdfcaggr("HDFC","TNagar Branch",addr1);
hdfc.displayDetails();
hdfc1.displayDetails();

}

}


