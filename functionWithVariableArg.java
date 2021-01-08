
/*
 * topics covered
 * -- constructor overloading
 * -- function with variable no of argument
 * -- primitive data types
 * 
 */

class primitive{
	
	char g;     // size 2-bytes hold single character
    boolean  h; // holds true or false
	
	         /* INTEGER DATA TYPES */
	
	byte a;     // size 1 - byte hold integer number  {  -(2^7)   t0  (2^7 -1)   }
	short b;    // size 2 - bytes hold integer number {  -(2^15)  t0  (2^15 -1)  }
	int c;      // size 4 - bytes hold integer number {  -(2^31)  t0  (2^31 -1)  }
	long d;     // size 8 - bytes hold integer number {  -(2^63)  t0  (2^63 -1)  }
	
	        /*  FRACTIONAL VALUE STORING DATA TYPES */
	
	float e;    // size 4 - bytes hold fractional number { upto 6 - 7  digit precision )
	double f;   // size 8 - bytes hold fractional number { upto 15 -16 digit precision )
	
	/* constructor overloading
	 * {types - default, parameterized, copy constructors}
	 * These constructors are overloaded below
	 * overloading done by changing 
	 * 			-- args type
	 *          -- no of args passed
	 * but overloading not done by changing return type,
	 */
	
    //default constructor 
	primitive(){
		System.out.println("default constructor executing");
		System.out.println("default constructor executed");
	}

	//parameterized constructor 
	primitive(byte a,short b,int c,long d,float e,double f,char g,boolean h){
		System.out.println("parameterized constructor executing");
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		System.out.println("parameterized constructor executed");
	}
	
	//copy constructor 
	primitive(primitive obj){
		System.out.println("copy constructor executing");
		this.a = obj.a;
		this.b = obj.b;
		this.c = obj.c;
		this.d = obj.d;
		this.e = obj.e;
		this.f = obj.f;
		this.g = obj.g;
		this.h = obj.h;
		System.out.println("copy constructor executed");
	}
	
	/*variable numbers of arguments passing to a function
	 * Not Allowed{
	 * -- more one variable numbers of arguments type in function
	 * -- as a first parameter or arg
	 * }
	 * must{
	 * -- multiple args can be used along with variable arg type
	 * but variable arg type should be declared at last
	 * }
	 */
	public void variableNumberOfArgument(int ...n) {
		System.out.println("function with variable arg type");
		if(n.length == 0) {
			System.out.println("Nothing is Passed (arg count = 0)");
		}
		else {
			System.out.printf("arg count = %d\n",n.length);
		}
		for(int i : n) {
			System.out.println(i);
		}
	}
}

public class functionWithVariableArg {

	public static void main(String[] args) {
		primitive obj1 = new primitive();
		primitive obj2 = new primitive((byte)127,(short)32767,4567,1214545L,1233.121F ,24144134.31415451455,'s',true);
		primitive obj3 = new primitive(obj2);
		obj1.variableNumberOfArgument();
		obj2.variableNumberOfArgument(1,2,3,4,5);
		obj3.variableNumberOfArgument(1,2,3,54,5,67,8,9,9,234,45);
	}

}
