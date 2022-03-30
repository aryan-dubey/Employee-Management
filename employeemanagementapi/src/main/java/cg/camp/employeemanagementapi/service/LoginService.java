package cg.camp.employeemanagementapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Login;

@Service
public interface LoginService {
	
	/*
	 * This login method asks for user name and password to check the login details in repository, 
	 * if not valid, then page remains unlogged
	 * @param (username, password)
	 * 
	 */
//	  public Login login(String user name, String password);
	  
	  /////////////////////////////////////////////////////////////////////////////////////////////
	
	
	  /*
	   * This method is used to save the login details in the database
	   * @param(username, password)
	   */
	  Login saveLogin(Login login);
	  
	  /*
	   * This method displays the login details of all the users to ADMIN only
	   * this method can't be accessed by a user(s)
	   * @return list of user login details
	   */
	  List<Login> getAllLoginDetails();
	  
	  /*
	   * This method display the user login details based on name specified
	   * @param(user name)
	   */
	  Login getUserByName(String username);
	  
	  /*
	   * This method is used to update the login details of the user such as user name and password
	   * @param(login, user name)
	   */
	  Login updateUserLoginDetails(Login login, String username);
	  
	  /*
	   * This method is used to delete a user login details based on specified user id
	   * @param(id)
	   */
	  void deleteUserLoginDetails(long id);
}


