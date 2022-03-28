package cg.camp.employeemanagementapi.exception;

public class DepartmentIdExceptionResoponse {

	private String deptId;

	public DepartmentIdExceptionResoponse(String deptId) {
		super();
		this.deptId = deptId;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
}
