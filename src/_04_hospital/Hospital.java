package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner gp) {
		doctors.add(gp);
	}

	public void addDoctor(Surgeon surgeon) {
		doctors.add(surgeon);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void assignPatientsToDoctors() throws Exception {
	//	addDoctor(new GeneralPractitioner());
	//	addDoctor(new Surgeon());
	//	addDoctor(new Surgeon());
	//		addPatient(new Patient());
		
		
		doctors.get(0).assignPatient(patients.get(0));
		doctors.get(0).assignPatient(patients.get(1));
		doctors.get(0).assignPatient(patients.get(2));
		doctors.get(1).assignPatient(patients.get(3));
		doctors.get(1).assignPatient(patients.get(4));
		doctors.get(1).assignPatient(patients.get(5));
		doctors.get(2).assignPatient(patients.get(6));
		doctors.get(2).assignPatient(patients.get(7));
		
	}

}
