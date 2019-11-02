package com.intercorp.retail.service;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intercorp.retail.model.ClientResponse;
import com.intercorp.retail.model.CreateClientRequest;
import com.intercorp.retail.model.Kpi;
import com.intercorp.retail.model.database.Client;
import com.intercorp.retail.repository.ClientRepository;
import com.intercorp.retail.util.Util;

@Service("clientService")
public class ClientServiceImpl implements ClientService{

	@Autowired(required=true)
    ClientRepository clientRpository;
	
	@Override
	public boolean addClient(CreateClientRequest client) {
		Client customer = clientRpository.save(new Client(null, client.getNombre(),
				client.getApellido(),client.getEdad(),
				client.getFechaNacimiento()));
		
		if(customer!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Kpi kpiClients() {
		List<Client> clients = (List<Client>) clientRpository.findAll();
		Integer plus = 0;
		
		for(Client customer :clients) {
			plus = customer.getAge() + plus;
		}
		
        BigDecimal average;
		if (!clients.isEmpty())
			average = new BigDecimal(plus/clients.size());
		else
			average = null;
		
		Kpi kpi = new Kpi();
		kpi.setAverage(average);
		
		Double plusTotal;
		Double varianza = 0.0;
		
		for(Client customer :clients) {
			plusTotal = Math.pow(new BigDecimal(customer.getAge()).subtract(average).doubleValue(), 2);
			varianza = varianza + plusTotal;
		}
		
		varianza = varianza / (clients.size() - 1);
		Double standardDeviation = Math.sqrt(varianza);
		kpi.setStandardDeviation(BigDecimal.valueOf(standardDeviation));
		
		return kpi;
	}

	@Override
	public List<ClientResponse> listClients() {
		List<Client> clients = (List<Client>)clientRpository.findAll();
		
		List<ClientResponse> listclientResponse = new ArrayList<>();
		for(Client customer :clients) {
			ClientResponse clientResponse = new ClientResponse();
			clientResponse.setName(customer.getName());
			clientResponse.setLastName(customer.getLastName());
			clientResponse.setAge(customer.getAge());
			Format formatter = new SimpleDateFormat("dd-MM-yyyy");
			clientResponse.setBirthday(formatter.format(customer.getBirthday()));
			clientResponse.setDeathDate(formatter.format(Util.calculateDeathDate(
					customer.getBirthday())));
			
			listclientResponse.add(clientResponse);
		}
		
		return listclientResponse;
	}

}
