package com.justimagine.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.justimagine.Response.AddressResponse;
import com.justimagine.Service.AddressServiceInterface;

@RestController
public class AddressController {

	@Autowired
	private AddressServiceInterface service;
	
	@GetMapping(value="/address/{employeeid}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeid") Integer employeeid)
	{
		
		
		
		
		AddressResponse  addressResponse = service.getAddressByEmployeeId(employeeid);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
		
		
	}
}
