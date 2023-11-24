package com.example.bookyourslot.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.bookyourslot.model.Login;

public interface LoginRepository extends CrudRepository<Login,Integer> {
	
}
