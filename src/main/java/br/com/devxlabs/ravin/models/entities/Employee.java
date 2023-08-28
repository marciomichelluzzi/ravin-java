package br.com.devxlabs.ravin.models.entities;

import br.com.devxlabs.ravin.enums.EmployeeAvaiability;
import br.com.devxlabs.ravin.enums.MaritalStatus;
import br.com.devxlabs.ravin.enums.Responsibility;
import br.com.devxlabs.ravin.enums.Schooling;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true, nullable = false)
	private String rg;
	@Column(unique = true, nullable = false)
	private int pis;
	@Enumerated(value = EnumType.STRING)
	private MaritalStatus maritalStatus;
	@Enumerated(value = EnumType.STRING)
	private Schooling schooling;
	@Enumerated(value = EnumType.STRING)
	private Responsibility responsibility;
	@Enumerated(value = EnumType.STRING)
	private EmployeeAvaiability employeeAvailability;
	private Date admissionDate;
	private Date resignationDate;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String rg, MaritalStatus maritalStatus, Schooling schooling, Responsibility responsibility,
					Date admissionDate, Date resignationDate, EmployeeAvaiability employeeAvailability, int pis) {
		super();
		this.id = id;
		this.rg = rg;
		this.maritalStatus = maritalStatus;
		this.schooling = schooling;
		this.responsibility = responsibility;
		this.admissionDate = admissionDate;
		this.resignationDate = resignationDate;
		this.employeeAvailability = employeeAvailability;
		this.pis = pis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Responsibility getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(Responsibility responsibility) {
		this.responsibility = responsibility;
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

	public EmployeeAvaiability getEmployeeAvailability() {
		return employeeAvailability;
	}

	public void setEmployeeAvailability(EmployeeAvaiability employeeAvailability) {
		this.employeeAvailability = employeeAvailability;
	}

	@Override
	public String toString() {
		return "Employee: \n rg=" + rg + ", \n meritalStatus=" + maritalStatus + ", \n schooling=" + schooling
				+ ", \n responsability=" + responsibility + ", \n pis=" + pis + ", admissionDate=" + admissionDate
				+ ", \n resignationDate=" + resignationDate + ", \n tableAviability=" + employeeAvailability;
	}
}
