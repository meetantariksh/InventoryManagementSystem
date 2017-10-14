package com.maass.ecom.inventory.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maass.ecom.inventory.Collections.SystemCheck;

@Repository
public interface SystemCheckRepository extends MongoRepository<SystemCheck, String> {
	
}
