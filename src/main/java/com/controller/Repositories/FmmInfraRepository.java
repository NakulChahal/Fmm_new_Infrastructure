package com.controller.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.controller.pojo.FmmInfrastructure;

//@EntityScan
//@EnableAutoConfiguration
@Repository("FmmInfraRepository")
@RepositoryRestResource(collectionResourceRel="FmmInfrastructure", path="data")
public interface FmmInfraRepository extends CrudRepository<FmmInfrastructure , Long> {
	public  List<FmmInfrastructure> findByincharge(String incharge);



	public List<FmmInfrastructure> findByorgSlNo(Long orgSlNo);

	

}
