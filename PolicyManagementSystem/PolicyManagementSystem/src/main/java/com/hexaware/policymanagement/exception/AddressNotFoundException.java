package com.hexaware.policymanagement.exception;

public class AddressNotFoundException extends RuntimeException 
{
	private static final long serialVersionUID = 1L;

	public AddressNotFoundException(String message) 
	{
        super(message);
    }
}