package cg.camp.employeemanagementapi.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Status {
	@Id
	@Column(updatable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long statusId;

	//@NotBlank(message="comments are required")
	private String comments;

	//@NotBlank(message="Details are required")
	private String details;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate createDate;
	
	@Column(updatable=false,unique=true)
	private long userId;
	@Column(updatable=false,unique=true)
	private long complianceId;
	
	@OneToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="deptId")
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
	public long getStatusId() {
		return statusId;
	}
	public void setStatusId(long statusId) {
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getComplianceId() {
		return complianceId;
	}
	public void setComplianceId(long complianceId) {
		this.complianceId = complianceId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


}