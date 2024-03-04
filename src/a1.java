class TypeException extends Exception{
	@Override
	public String toString() {
		return "Vehicle Type Not Set";
	}
}
 
class Vehicles{
	String type;
	String model_no;
	String model_name;
	String owner_name;
	String owner_details;
	public Vehicles(String model_no,String model_name,String owner_name,String owner_details){
		this.model_no=model_no;
		this.model_name=model_name;
		this.owner_name=owner_name;
		this.owner_details=owner_details;
	}
	public Vehicles() {}
	public String get_type() {
		return type;
	}
	public String retrieve() {
		return "null";
	}

 
}
 
class Car extends Vehicles{
	public Car(String model_no,String model_name,String owner_name,String owner_details) {
		super(model_no,model_name,owner_name,owner_details);
	}
	public Car() {}
	public String get_type(){
		return type;
	}
	public void set_type(String type) {
		this.type=type;
	}
	@Override
	public String retrieve() {
		if(type==null) {
			try {
				throw new TypeException();
			}
			catch(TypeException e) {
				return e.toString();
			}
		}
		else {
			return model_no +","+model_name +","+owner_details +","+owner_name;
		}
	}
}
 
 
 
public class a1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Vehicles object
        Vehicles vehicle = new Vehicles("123", "Toyota", "John", "Contact: 123456");
 
        // Create a Car object
        Car car = new Car("456", "Honda", "Alice", "Contact: 789012");
 
        // Set type for car
        car.set_type("Sedan");
 
        // Display type of car
        System.out.println("Car Type: " + car.get_type());
 
        // Display information of the car
        System.out.println("Car Information: " + car.retrieve());
 
        // Display information of the vehicle
        System.out.println("Vehicle Information: " + vehicle.retrieve());
 
	}
 
}





