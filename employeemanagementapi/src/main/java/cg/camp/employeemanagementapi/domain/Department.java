package cg.camp.employeemanagementapi.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deptId;
	@NotBlank(message="department name required")
	@Column(unique = true)
	private String deptName;
/*
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Compliance compliance;
	public Compliance getCompliance() {
		return compliance;
	}
	public void setCompliance(Compliance compliance) {
		this.compliance = compliance;
	}
	
	
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}	

 */
	@OneToOne(fetch = FetchType.EAGER, mappedBy="department")
	@JsonIgnore
	private Status status;
	@OneToOne(fetch = FetchType.EAGER, mappedBy="department")
	@JsonIgnore
	private Compliance compliance;

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
