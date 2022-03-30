package cg.camp.employeemanagementapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * The login class is kept as Entity to display in database
 * table name is login
 */
@Entity
@Table(name = "login")
public class Login {

	/*
	 * Id is the primary key
	 * not null
	 * auto generated
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * user name will be asked on login page to authenticate
	 * unique and not null
	 */
	@Column(nullable = false)
	private String username;
	
	/*
	 * password will be asked on login page to authenticate
	 */
	@Column(nullable = false)
	private String password;
	
	
	private String role;
	
	// default constructor
	public Login() {
		
	}
	
	// parameterized constructor
	public Login(Long id, String username, String password, String role) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.role=role;
	}
	
	// Getters and Setters
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
