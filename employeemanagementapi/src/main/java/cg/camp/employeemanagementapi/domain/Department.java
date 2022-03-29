package cg.camp.employeemanagementapi.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deptId;
	@NotBlank(message="department name required")
	@Column(unique = true)
	private String deptName;

	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDeptName(String departName) {
		this.deptName = departName;
	}
	@Override
	public String toString() {
		return "Department [departId=" + deptId + ", departName=" + deptName + "]";
	}
	

}
