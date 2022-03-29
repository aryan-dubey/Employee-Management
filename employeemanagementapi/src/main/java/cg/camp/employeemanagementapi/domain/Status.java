package cg.camp.employeemanagementapi.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Status {
	private int statusId;
	private String comments;
	private String details;
	private LocalDate createDate;
	private int userId;
	private int complianceId;
	private Department department;
	
	
	
//	public Status(int statusId, String comments, String details, LocalDate createDate, int userId, int complianceId,
//			Department department) {
//		super();
//		this.statusId = statusId;
//		this.comments = comments;
//		this.details = details;
//		this.createDate = createDate;
//		this.userId = userId;
//		this.complianceId = complianceId;
//		this.department = department;
//	}
	
	
	
	
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
//	@Override
//	public String toString() {
//		return "Status [statusId=" + statusId + ", comments=" + comments + ", details=" + details + ", createDate="
//				+ createDate + ", userId=" + userId + ", complianceId=" + complianceId + ", department=" + department
//				+ "]";
//	}
//	

}
