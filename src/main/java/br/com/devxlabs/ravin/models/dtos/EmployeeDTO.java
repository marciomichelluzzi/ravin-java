package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;
import java.util.Date;

import br.com.devxlabs.ravin.models.enums.EmployeeAviability;
import br.com.devxlabs.ravin.models.enums.MeritalStatus;
import br.com.devxlabs.ravin.models.enums.Responsibility;
import br.com.devxlabs.ravin.models.enums.Schooling;

public class EmployeeDTO extends PersonDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String rg;

	private MeritalStatus meritalStatus;

	private Schooling schooling;

	private Responsibility responsability;

	private int pis;

	private Date admissionDate;
	private Date resignationDate;
	private EmployeeAviability employeeAviability;

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(int id, String rg, MeritalStatus meritalStatus, Schooling schooling,
			Responsibility responsability, Date admissionDate, Date resignationDate,
			EmployeeAviability employeeAviability, int pis) {
		super();
		this.rg = rg;
		this.meritalStatus = meritalStatus;
		this.schooling = schooling;
		this.responsability = responsability;
		this.admissionDate = admissionDate;
		this.resignationDate = resignationDate;
		this.employeeAviability = employeeAviability;
		this.pis = pis;
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
		return "EmployeeDTO [rg=" + rg + ", meritalStatus=" + meritalStatus + ", schooling=" + schooling
				+ ", responsability=" + responsability + ", pis=" + pis + ", admissionDate=" + admissionDate
				+ ", resignationDate=" + resignationDate + ", employeeAviability=" + employeeAviability + "]";
	}
}
