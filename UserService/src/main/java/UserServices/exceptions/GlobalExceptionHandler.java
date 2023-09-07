package UserServices.exceptions;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import UserServices.apiResp.ApiResponse;
import lombok.*;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerUserNotFoundException(UserNotFoundException ex){
		String message = ex.getMessage();
		//ApiResponse response = ApiResponse.Message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		
		ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		
		//return new ResponseEntity<String>("Resource Not Founf Vikram: " + message, HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}

}
