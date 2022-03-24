package cg.camp.employeemanagementapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import cg.camp.employeemanagementapi.exception.DepartmentNameExceptionResoponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	private ResponseEntity<Object> handleDepartmentIdException(DepartmentNameException ex,WebRequest request) {
		// TODO Auto-generated method stub
		DepartmentNameExceptionResoponse errorMessage=new DepartmentNameExceptionResoponse(ex.getMessage());
		return new ResponseEntity<Object>(errorMessage,HttpStatus.BAD_REQUEST); 
	}
}
