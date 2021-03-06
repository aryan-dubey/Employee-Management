package cg.camp.employeemanagementapi.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {
	
	@Id
	@Column(updatable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@NotBlank(message="First Name is required")
	private String firstName;
	
	@NotBlank(message="Last Name is required")
	private String lastName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	@NotBlank(message="Email is required")
	@Column(updatable=false,unique=true)
	private String email;
	
	
	public Employee() {
		
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*one to one with Login  
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	//private Department department;
//public Department getDepartment() {
	//return department;
	//}

	//public void setDepartment(Department department) {
		//this.department = department;
	//}*/
	
}
