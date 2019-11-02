package com.intercorp.retail.service;

import java.util.List;

import com.intercorp.retail.model.ClientResponse;
import com.intercorp.retail.model.CreateClientRequest;
import com.intercorp.retail.model.Kpi;

public interface ClientService {

	public boolean addClient(CreateClientRequest client);
	
	public Kpi kpiClients();
	
	public List<ClientResponse> listClients();
	
}
