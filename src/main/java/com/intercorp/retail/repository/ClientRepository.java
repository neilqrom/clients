package com.intercorp.retail.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.intercorp.retail.model.database.Client;

@Repository("clientRepository")
public interface ClientRepository extends CrudRepository<Client, Long>{

}
