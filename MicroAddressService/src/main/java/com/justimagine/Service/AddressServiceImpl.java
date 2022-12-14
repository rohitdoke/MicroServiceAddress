package com.justimagine.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justimagine.Entity.Address;
import com.justimagine.Repo.AddressServiceRepo;

import com.justimagine.Response.AddressResponse;
@Service
public class AddressServiceImpl implements AddressServiceInterface {

	@Autowired
	private AddressServiceRepo repo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public AddressResponse getAddressByEmployeeId(Integer employeeid) {

		Address address = repo.findAddressByEmployeeId(employeeid);
		
		
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
	}

}
