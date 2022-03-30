package cg.camp.employeemanagementapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cg.camp.employeemanagementapi.domain.Login;
import cg.camp.employeemanagementapi.service.LoginService;



@RestController
@RequestMapping("/api/login")
public class LoginController {
//	@Autowired
//    private LoginService userService;
// 
//                                  
//    @GetMapping("/login")
//    public ModelAndView login() {
//     ModelAndView mav = new ModelAndView("login");
//        mav.addObject("user", new Login());
//        return mav
//    }
// 
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") Login user ) {
//    
//     Login oauthUser = userService.login(user.getUsername(), user.getPassword());
//    
// 
//     System.out.print(oauthUser);
//     if(Objects.nonNull(oauthUser))
//     {
//     return "redirect:/";
//
//     } else {
//     return "redirect:/login";
//     
//     }
//}
//    
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
//    {
//        return "redirect:/login";
//    }
    
    ////////////////////////////////////////////////////////////////////
    
    private LoginService loginService;
    
    public LoginController(LoginService loginService) {
	super();
	this.loginService = loginService;
}

	// save login details API
    @PostMapping()
    public ResponseEntity<Login> saveLogin(@RequestBody Login login) {
    	
		return new ResponseEntity<Login>(loginService.saveLogin(login), HttpStatus.CREATED);
    }
    
    // get all login details API
    @GetMapping
    public List<Login> getAllLoginDetails() {
    	
    	return loginService.getAllLoginDetails();
    }
    
    // get user login details by user name
    @GetMapping("{username}")
    public ResponseEntity<Login> getUserByName(@PathVariable("username") String username) {
    	return new ResponseEntity<Login>(loginService.getUserByName(username), HttpStatus.OK);
    }
    
    // update user login details API
    @PutMapping("{username}")
    public ResponseEntity<Login> updateUserLoginDetails(@PathVariable("username") String username, @RequestBody Login login) {
    	
    	return new ResponseEntity<Login>(loginService.updateUserLoginDetails(login, username), HttpStatus.OK);
    }
    
    // delete a user login detail
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUserLogin(@PathVariable("id") long id) {
    	
    	loginService.deleteUserLoginDetails(id);
    	
    	return new ResponseEntity<String>("Details deleted successfully!", HttpStatus.OK);
    }
    
 
}