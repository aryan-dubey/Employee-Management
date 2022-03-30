package cg.camp.employeemanagementapi.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Status {
	@Id
	@Column(updatable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int statusId;

	@NotBlank(message="comments are required")
	private String comments;

	@NotBlank(message="Details are required")
	private String details;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate createDate;
	
	@Column(updatable=false,unique=true)
	private int userId;
	@Column(updatable=false,unique=true)
	private int complianceId;
	
	private Department department;
	
	
	/*
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Compliance compliance;
	public Compliance getCompliance() {
		return compliance;
	}
	public void setCompliance(Compliance compliance) {
		this.compliance = compliance;
	}
	
	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}	

 */
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(int complianceId) {
		this.complianceId = complianceId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


}