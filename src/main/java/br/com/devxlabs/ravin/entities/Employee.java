package br.com.devxlabs.ravin.entities;

import java.util.Date;

import br.com.devxlabs.ravin.enums.EmployeeAvaiability;
import br.com.devxlabs.ravin.enums.MaritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;

public class Employee extends Person {

	private int employeeId;
	private String rg;
	private MaritalStatus maritalStatus;
	private Schooling schooling;
	private Responsibility responsability;
	private int pis;
	private Date admissionDate;
	private Date resignationDate;
	private EmployeeAvaiability employeeAviability;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String rg, MaritalStatus maritalStatus, Schooling schooling, Responsibility responsability,
					Date admissionDate, Date resignationDate, EmployeeAvaiability employeeAviability, int pis) {
		super();
		this.employeeId = employeeId;
		this.rg = rg;
		this.maritalStatus = maritalStatus;
		this.schooling = schooling;
		this.responsability = responsability;
		this.admissionDate = admissionDate;
		this.resignationDate = resignationDate;
		this.employeeAviability = employeeAviability;
		this.pis = pis;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public MaritalStatus getMeritalStatus() {
		return maritalStatus;
	}

	public void setMeritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Schooling getSchooling() {
		return schooling;
	}

	public void setSchooling(Schooling schooling) {
		this.schooling = schooling;
	}

	public Responsibility getResponsability() {
		return responsability;
	}

	public void setResponsability(Responsibility responsability) {
		this.responsability = responsability;
	}

	public int getPis() {
		return pis;
	}

	public void setPis(int pis) {
		this.pis = pis;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public EmployeeAvaiability getEmployeeAviability() {
		return employeeAviability;
	}

	public void setEmployeeAviability(EmployeeAvaiability employeeAviability) {
		this.employeeAviability = employeeAviability;
	}

	@Override
	public String toString() {
		return "Employee: \n rg=" + rg + ", \n meritalStatus=" + maritalStatus + ", \n schooling=" + schooling
				+ ", \n responsability=" + responsability + ", \n pis=" + pis + ", admissionDate=" + admissionDate
				+ ", \n resignationDate=" + resignationDate + ", \n tableAviability=" + employeeAviability;
	}
}
