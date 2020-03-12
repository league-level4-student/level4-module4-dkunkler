package _04_hospital;

public class Patient {
	boolean feelsCaredFor = false;
	
	void checkPulse() {
		feelsCaredFor = true;
	}
	
	boolean feelsCaredFor() {
		return feelsCaredFor;
	}
}
