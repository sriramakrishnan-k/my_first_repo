

class X{
	
	public static String staticVariable; // static member
	private String instanceVariable; // instance member(Encapsulation technique achieved by making private)
	
	// static block to initialize static variable
	static {
		staticVariable = "this is a static variable";
	}
	
	//static method belong to class
	static void show() {
		//this.instanceVariable
		//usage of this is not allow inside a static member
		//hence using this keyword to access instances member is prohibited
		
		System.out.println(X.staticVariable);
		
		//static method can access static members
		//to access instance members two ways are there
		//1 - using a object (passing as an arg to static function)
		//2 - by creating new instance
	}
	
	//parameterized constructor
	public X(String instanceVariable){
		this.instanceVariable = instanceVariable;
	}
	
	//setter method for instance variable
	public String setInstanceVariable(String instanceVariable) {
		return this.instanceVariable = instanceVariable;
	}
	
	//getter method for instance variable
	public String getInstanceVariable() {
		return this.instanceVariable;
	}
	
	//member function belong to class object
	public void display() {
		System.out.println(this.getInstanceVariable());
	}
}

public class ClassDeclaration {

	public static void main(String[] args) {
		X obj = new X("this is a instance variable");
		
		System.out.println("Accessing instance variable using class obj --> "+obj.getInstanceVariable());
		
		obj.setInstanceVariable("new value is given");
		System.out.println("Accessing instance variable using class obj after setting new value using setter method--> "+obj.getInstanceVariable());
		
		System.out.println("* Accessing instance method(display method) using class obj *");
		obj.display();
		
		System.out.println("* Accessing static method(show method) using class name *");
		X.show();
		
		System.out.println("* Accessing static method(show method) using class object(not recommended way) *");
		obj.show();
	}

}
