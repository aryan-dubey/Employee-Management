package cg.camp.employeemanagementapi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="Compliances")
public class Compliance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long complianceId;
	
	private String rlType;
	
	private String details;
	
	@JsonFormat(pattern="yyyy-MM -dd")
	private Date createDate;
	
	//private Department department;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	private int empCount;
	
	private int stsCount;
	
	private String status;

	
	public Compliance() {
		super();
	}
	public Long getComplianceId() {
		return complianceId;
	}

	public void setComplianceId(Long complianceId) {
		this.complianceId = complianceId;
	}

	public String getRlType() {
		return rlType;
	}

	public void setRlType(String rlType) {
		this.rlType = rlType;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/*public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}*/

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public int getStsCount() {
		return stsCount;
	}

	public void setStsCount(int stsCount) {
		this.stsCount = stsCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
