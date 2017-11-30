class address {

String location;
String city;
String state;

//Parameterized constructor

address(String location, String city, String state){
this.location = location;
this.city = city;
this.state = state;

}

//Method

void showDetails(){
System.out.println("Location   :"+location + "City  :"+city+ "State  :"+state);

}
}








