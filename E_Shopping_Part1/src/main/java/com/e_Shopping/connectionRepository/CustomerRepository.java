package com.e_Shopping.connectionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.e_Shopping.model.CustomerDetails;
import java.util.List;


public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {
//	@Query("Select cd from CustomerDetails where (cd.Email=:email And cd.Password=:password) or (cd.Email=:email And cd.Password=:password) ")
//	 List<CustomerDetails> findByEmailOrMobileAndPassword(String email, String password);

	@Query("SELECT cd FROM CustomerDetails cd WHERE cd.email = :email AND cd.password = :password")
	List<CustomerDetails> findByEmailAndPassword(String email, String password);

	
}
