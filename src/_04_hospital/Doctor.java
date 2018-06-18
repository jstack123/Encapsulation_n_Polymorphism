package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> patientsForDoctors = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) {
		patientsForDoctors.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patientsForDoctors;
	}
	
	public void doMedicine() {
		//Patient.feelsCaredFor=true;
	}

}
