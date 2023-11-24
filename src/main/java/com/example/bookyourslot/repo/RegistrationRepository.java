package com.example.bookyourslot.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.bookyourslot.model.Registration;

public interface RegistrationRepository extends CrudRepository<Registration,Integer> {
	
}
