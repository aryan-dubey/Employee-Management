package cg.camp.employeemanagementapi.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cg.camp.employeemanagementapi.domain.Login;
import cg.camp.employeemanagementapi.service.LoginService;

@RestController
@RequestMapping("/api/employees/login")
public class LoginController {
	
	
	@Autowired
	    private LoginService userService;
	 
	                                  
	    @GetMapping("/login")
	          
	    public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("user", new Login());
	        return mav;
	    }
	 
	    @PostMapping("/login")
	    public String login(@ModelAttribute("user") Login user ) {
	    
	     Login oauthUser = userService.login(user.getUsername(), user.getPassword());
	    
	 
	     System.out.print(oauthUser);
	     if(Objects.nonNull(oauthUser))
	     {
	  
	     return "redirect:/";
	    
	    
	     } else {
	     return "redirect:/login";
	    
	    
	     }
	 
	}
	    
	    //@RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
	    //public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	   // {
	    
	  
	       // return "redirect:/login";
	   // }
	 
	}


