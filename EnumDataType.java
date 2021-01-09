
/*
 * Topic covered
 * --local,instance,static
 * --Enum data type
 */

enum Quadrants{
	// static and final by default
	FIRST_QUADRANT("+,+"),// implicit calling of construct to create enum obj
	SECOND_QUADRANT("-,+"),
	THIRD_QUADRANT("-,-"),
	FORTH_QUADRANT("+,-");// semicolon should include at the end if  we going to add member function 
						 // in enum.
	
	private final String info; // private and package private (are recommended)
							  //  public can be used but not recommended to achieve encapsulation
	
	//private / constructor
	// new operator is illegal to create a obj for enum(both inside and outside of a class)
	// hence construct for enum class should be private 
	// constants in enum (static by default are the instance of enum class in which these belongs)
	// these constants  can us constructor implicitly
	private Quadrants(String info) {
		this.info = info;
	}
	
	//get method for info field
	public String getInfo() {
		return this.info;
	}
	
	//member function (this can be access through constants(obj) declared in enum
	public void show() {
		System.out.println(this.info);
	}
}

public class EnumDataType {

	public static void main(String[] args) {
		Quadrants.FIRST_QUADRANT.show();

		for(Quadrants i : Quadrants.values()) {
			System.out.println(i);
		}
	}

}
