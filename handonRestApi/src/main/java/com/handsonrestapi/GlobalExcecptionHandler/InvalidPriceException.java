package com.handsonrestapi.GlobalExcecptionHandler;

import org.springframework.aop.ThrowsAdvice;

public class InvalidPriceException extends Throwable {
	
	private String msg;
	
	public InvalidPriceException() {
		
	}

	public InvalidPriceException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		System.out.println("Invaliid Price Excepton Constructor Called");
		this.msg = msg;
	}

}
