package _04_hospital;

public class Patient {

	boolean feelsCaredFor = false;
	public boolean feelsCaredFor() {

		if (feelsCaredFor==true) {
			return true;
		}
		return false;
	}

	public void checkPulse() {
		feelsCaredFor = true;
	}

}
