package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> patients;
	
	Doctor(){
		patients = new ArrayList<Patient>();	
	}
	
	void assignPatient(Patient p) throws DoctorFullException{
		
			if(patients.size()<3) {
		
			patients.add(p);
			return;
			}
		throw new DoctorFullException("Doctor cannot take any more patients");
	}
	
	boolean performsSurgery() {
		if(this.getClass().equals(Surgeon.class)) {
			return true;
		}
		return false;
	}
	
	boolean makesHouseCalls() {
		if(this.getClass().equals(GeneralPractitioner.class)) {
			return true;
		}
		return false;
	}
	
	ArrayList<Patient> getPatients(){
		return patients;
	}
	
	void doMedicine() {
		for(Patient p : patients) {
			p.checkPulse();
		}
	}
}
