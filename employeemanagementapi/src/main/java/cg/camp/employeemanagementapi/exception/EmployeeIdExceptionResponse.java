package cg.camp.employeemanagementapi.exception;

public class EmployeeIdExceptionResponse {
private String userid;
	
	public EmployeeIdExceptionResponse(String userid) {
		super();
		this.userid=userid;
	}

	public String getId() {
		return userid;
	}

	public void setId(String userid) {
		this.userid = userid;
	}

}
