package cg.camp.employeemanagementapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cg.camp.employeemanagementapi.domain.Employee;
import cg.camp.employeemanagementapi.service.IEmployeeService;
import cg.camp.employeemanagementapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iemployeeService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewEmployee(@Valid @RequestBody Employee employee,BindingResult result) {
		
			ResponseEntity<?> errormap=mapValidationErrorService.mapValidationError(result);
			if(errormap!=null){
				return errormap;
			}
			
		Employee savedEmployee = iemployeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
		
	}
	

}
