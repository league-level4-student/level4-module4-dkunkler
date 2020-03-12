package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors;
	ArrayList<Patient> patients;
	
	Hospital(){
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	ArrayList<Patient> getPatients(){
		return patients;
	}
	
	void assignPatientsToDoctors() {
		int doctor = 0;
		for(Patient p : patients) {
			if(doctors.get(doctor).getPatients().size()==3) {
				doctor++;
			}
			try 
			{
				doctors.get(doctor).assignPatient(p);
			} catch(DoctorFullException e)
			{
				System.out.println("Doctor full");
			}				
		}
	}
	
}
