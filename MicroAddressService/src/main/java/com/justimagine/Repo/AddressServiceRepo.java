package com.justimagine.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.justimagine.Entity.Address;
@Repository
public interface AddressServiceRepo extends JpaRepository<Address, Integer> {

	
	@Query(value="SELECT ea.id,ea.line1,ea.line2,ea.state,ea.zip FROM empmicroservice.address ea\r\n"
			+ "join\r\n"
			+ " empmicroservice.employee e\r\n"
			+ " where ea.employee_id=:employeeid",nativeQuery = true)
	public Address findAddressByEmployeeId(@Param("employeeid") int employeeid);
	
}
