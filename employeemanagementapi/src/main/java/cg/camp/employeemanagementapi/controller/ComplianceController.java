package cg.camp.employeemanagementapi.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cg.camp.employeemanagementapi.domain.Compliance;
import cg.camp.employeemanagementapi.domain.Status;
import cg.camp.employeemanagementapi.service.IComplianceService;
import cg.camp.employeemanagementapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/employeemanagement/compliance")
public class ComplianceController {
   
	@Autowired
	private IComplianceService complianceService;
	
	
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	
	
	@GetMapping("/listall")
	public ResponseEntity<?> getAllRL(){
	    return new ResponseEntity<Iterable<Compliance>>(complianceService.getAllRL(),HttpStatus.OK);
	  }
	  
	  
	  @PostMapping("")
	  public ResponseEntity<?> addNewCompliance(@Valid @RequestBody Compliance co, BindingResult result) {
	    ResponseEntity<?> errorMessage=mapValidationErrorService.mapValidationError(result);
	    
	    if(errorMessage!=null) {
	    	return errorMessage;
	    }
	    Compliance savedCompliance=complianceService.addRL(co);
	    
	    return new ResponseEntity<Compliance>(savedCompliance,HttpStatus.ACCEPTED);
	  }
	  
	  @GetMapping("/{complianceId}")
	  public ResponseEntity<?> getComplianceById(@PathVariable("complianceId") Long complianceId){
		  Compliance compliance = complianceService.findComplianceByComplianceId(complianceId);
		  return new ResponseEntity<Compliance>(compliance, HttpStatus.ACCEPTED);
	  }
	  
	  @PostMapping("")
	  public ResponseEntity<?> addStatusReport(@RequestBody Status st )
	  {
		  Status sta=complianceService.createStatusReport(st);
		  return new ResponseEntity<Status>(sta, HttpStatus.CREATED);
	  }
	  
	  @GetMapping("/ListAll")
	  public Iterable<Status> showAllStatusReport()
	  {
		  return complianceService.getAllStatusReport();
	  }
	  
	  
	  
}
