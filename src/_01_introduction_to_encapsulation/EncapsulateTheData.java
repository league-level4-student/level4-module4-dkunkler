package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	private
	int itemsReceived; //must not be negative. All negative arguments get set to 0.
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
	
	int getItemsReceived() {
		return itemsReceived;
	}
	
	void setItemsReceived(int i) {
		if(i<0) {
			i=0;
		}
		itemsReceived = i;
	}
	
	float getDegreesTurned() {
		return degreesTurned;
	}
	
	void setDegreesTurned(float f) {
		if((f > 360) || (f < -360)) {
			f = f%360;
		}
		if(f<0) {
			f = 360+f;
		}
		degreesTurned = f;
	}

	String getNomenclature() {
		return nomenclature;
	}
	
	void setNomenclature(String s) {
		if(s.length()==0) {
			nomenclature = " ";
		}
		else {
			nomenclature = s;
		}
	}
	
	Object getObject() {
		return memberObj;
	}
	
	void setObject(Object o) {
		if(o.getClass().equals(String.class)){
			memberObj = new Object();
		}
		else {
			memberObj = o;
		}
	}
	
	
}
