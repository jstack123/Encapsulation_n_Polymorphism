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

	public void assignPatient(Patient patient) throws Exception {

		if (patientsForDoctors.size() < 3) {
			patientsForDoctors.add(patient);
		} else {
			throw new DoctorFullException();
		}
	}

	public ArrayList<Patient> getPatients() {
		return patientsForDoctors;
	}

	public void doMedicine() {
		for (int i = 0; i < patientsForDoctors.size(); i++) {
			patientsForDoctors.get(i).checkPulse();
		}

	}

}
