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

}
