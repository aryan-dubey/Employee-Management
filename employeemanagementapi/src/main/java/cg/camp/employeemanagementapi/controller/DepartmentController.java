package cg.camp.employeemanagementapi.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cg.camp.employeemanagementapi.domain.Department;
import cg.camp.employeemanagementapi.service.DepartmentService;
import cg.camp.employeemanagementapi.serviceimpl.MapValidationErrorService;
@RestController
@RequestMapping("/api/employeemanagement")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> addNewEmployee(@Valid @RequestBody Department department,BindingResult result) {
		
		ResponseEntity<?> errorMesssage=mapValidationErrorService.mapValidationError(result);
		if(errorMesssage!=null) {
			return errorMesssage;
		}
		Department savedDepartment=deptService.addDepartment(department);
		return new ResponseEntity<Department>(savedDepartment,HttpStatus.ACCEPTED);
	}
	@GetMapping("/{deptId}")
	public ResponseEntity<?> getDepartmentById(@PathVariable("deptId") Long departmentId){
		Department dept=deptService.findDepartmentByDeptId(departmentId);
		return new ResponseEntity<Department>(dept, HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/listall")
	public ResponseEntity<?> getAllDepartments(){
		return new ResponseEntity<Iterable<Department>>(deptService.findallDepartments(),HttpStatus.OK);
	}
	@DeleteMapping("/{deptId}")
	public ResponseEntity<?> deleteById(@Valid @PathVariable("deptId") Long departmentId){
		deptService.delete(departmentId);
		return new ResponseEntity<String>("Department of id "+departmentId+"Deleted sucessfully",HttpStatus.OK);
	}
	

}
