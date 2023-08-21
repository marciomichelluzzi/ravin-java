package br.com.devxlabs.ravin.entities;

import java.util.Date;

import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;

public class Employee extends Person {

	private int employeeId;
	private String rg;
	private MeritalStatus meritalStatus;
	private Schooling schooling;
	private Responsibility responsability;
	private int pis;
	private Date admissionDate;
	private Date resignationDate;
	private EmployeeAviability employeeAviability;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String rg, MeritalStatus meritalStatus, Schooling schooling, Responsibility responsability,
			Date admissionDate, Date resignationDate, EmployeeAviability employeeAviability, int pis) {
		super();
		this.employeeId = employeeId;
		this.rg = rg;
		this.meritalStatus = meritalStatus;
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

	public MeritalStatus getMeritalStatus() {
		return meritalStatus;
	}

	public void setMeritalStatus(MeritalStatus meritalStatus) {
		this.meritalStatus = meritalStatus;
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

	public EmployeeAviability getEmployeeAviability() {
		return employeeAviability;
	}

	public void setEmployeeAviability(EmployeeAviability employeeAviability) {
		this.employeeAviability = employeeAviability;
	}

	@Override
	public String toString() {
		return "Employee: \n rg=" + rg + ", \n meritalStatus=" + meritalStatus + ", \n schooling=" + schooling
				+ ", \n responsability=" + responsability + ", \n pis=" + pis + ", admissionDate=" + admissionDate
				+ ", \n resignationDate=" + resignationDate + ", \n tableAviability=" + employeeAviability;
	}
}
