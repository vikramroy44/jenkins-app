package com.handsonrestapi.GlobalExcecptionHandler;

import javax.naming.InvalidNameException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
	@ExceptionHandler
	public String handleInvalidNameException(InvalidNameException exception) {
		System.out.println("Exception Handler Executed");
		logger.debug(exception, exception);
		return exception.getMessage();
	}
	
	@ExceptionHandler
	public String handlePriceNotValidException(InvalidPriceException ex) {
		logger.info("Vikram  Info Logger Called " + ex);
		return ex.getMessage();
	}

}
