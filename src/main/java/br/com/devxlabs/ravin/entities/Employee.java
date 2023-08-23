package br.com.devxlabs.ravin.entities;

import java.util.Date;

import br.com.devxlabs.ravin.enums.EmployeeAviability;
import br.com.devxlabs.ravin.enums.MeritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String rg;
	
	@Enumerated(value = EnumType.STRING)
	private MeritalStatus meritalStatus;
	
	@Enumerated(value = EnumType.STRING)
	private Schooling schooling;
	
	@Enumerated(value = EnumType.STRING)
	private Responsibility responsability;
	
	@Column(unique = true, nullable = false)
	private int pis;
	
	private Date admissionDate;
	private Date resignationDate;
	
	@Enumerated(value = EnumType.STRING)
	private EmployeeAviability employeeAviability;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String rg, MeritalStatus meritalStatus, Schooling schooling, Responsibility responsability,
			Date admissionDate, Date resignationDate, EmployeeAviability employeeAviability, int pis) {
		super();
		this.id = id;
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
		return id;
	}

	public void setEmployeeId(int employeeId) {
		this.id = employeeId;
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
