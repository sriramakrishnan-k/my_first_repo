// Abstract method ( may or may not have abstract method but cannot instantiated
abstract class A{
	
	String info; //class attribute
	
	//constructor
	A(String info){
		System.out.println("class A constructor executing");
		this.info = "from class A " +  info;
	}
	
	//abstract method
	abstract void display();
}

/*public static final variables ,
public abstract, methods ,
default methods are allowed in interface */
interface B{
	//variable in interface
	String info = "interface variable (static and final by default)";
	
	//this method should be implement by the implementing class
	abstract void  display(); 
	
	default void  message() {
		System.out.println("default method are the method which can be implemented within interface");
		System.out.println("default method can be override by the implementing class if required");
	}
}

class C extends A implements B{
	
	public String detail;
	
	//constructor
	C(String info) {
		super(info); // this should be the first line of child class construct
		System.out.println("class C constructor executing");
		this.detail =  "from class C " + info;
	}
	
	//display method implementation
	public void display() {
		System.out.println("display function in class C");
	}
	
}

public class AbstractAndInterface {

	public static void main(String[] args) {
		C obj = new C("class c object");
		obj.display();
		obj.message(); //default  method in interface
	}

}
