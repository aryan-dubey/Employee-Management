package cg.camp.employeemanagementapi.exception;

public class ComplianceIdExceptionResponse {
	private String complianceId;

	public ComplianceIdExceptionResponse(String complianceId) {
		super();
		this.complianceId = complianceId;
	}

	public String getComplianceId() {
		return complianceId;
	}

	public void setComplianceId(String complianceId) {
		this.complianceId = complianceId;
	}
	
}
