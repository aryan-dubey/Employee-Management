package cg.camp.employeemanagementapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandlerComp extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public final ResponseEntity<Object> handleComplianceIdException(ComplianceIdException ex, WebRequest request){
		ComplianceIdExceptionResponse exceptionResponse = new ComplianceIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
	
}
