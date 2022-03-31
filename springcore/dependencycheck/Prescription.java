package com.ust1.spring.springcore.dependencycheck;

import java.util.List;

public class Prescription {
	private int id;
	private String patientname;
	private List<String> medicines;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientname=" + patientname + ", medicines=" + medicines + "]";
	}

}
