package cg.camp.employeemanagementapi.exception;

public class EmployeeEmailExceptionResponse {

	private String email;

	public EmployeeEmailExceptionResponse(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
