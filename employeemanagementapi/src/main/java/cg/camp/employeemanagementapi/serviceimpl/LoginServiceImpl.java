package cg.camp.employeemanagementapi.serviceimpl;
import java.util.List;

import org.springframework.stereotype.Service;

import cg.camp.employeemanagementapi.domain.Login;
import cg.camp.employeemanagementapi.repository.LoginRepository;
import cg.camp.employeemanagementapi.service.LoginService;
 
/*
 * This class checks if login details entered are correct or not
 */
@Service
public class LoginServiceImpl implements LoginService {

//	@Autowired
//	private LoginRepository repo;
//  
//	public Login login(String username, String password) {
//		Login user = repo.findByUsernameAndPassword(username, password);
//		return user;
//	  }
	
	////////////////////////////////////////////////////////////////////////////
	
	private LoginRepository loginRepository;

	public LoginServiceImpl(LoginRepository loginRepository) {
		super();
		this.loginRepository = loginRepository;
	}

	@Override
	public Login saveLogin(Login login) {
		return loginRepository.save(login);
	}

	@Override
	public List<Login> getAllLoginDetails() {
		return loginRepository.findAll();
	}

	@Override
	public Login getUserByName(String username) {
		
		Login login = loginRepository.findByUsername(username);
		
		// exception handle
		
		return loginRepository.findByUsername(username);
	}

	@Override
	public Login updateUserLoginDetails(Login login, String username) {
		
		Login existingLogin = loginRepository.findByUsername(username);
		
		if (existingLogin != null) {
			existingLogin.setUsername(login.getUsername());
			existingLogin.setPassword(login.getPassword());
		}
		
		loginRepository.save(existingLogin);
		
		return existingLogin;
	}

	@Override
	public void deleteUserLoginDetails(long id) {
		
		loginRepository.findById(id);

		loginRepository.deleteById(id);
	}
}
