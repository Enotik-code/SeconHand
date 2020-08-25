package by.seconhand.service;

import by.seconhand.bean.Client;
import by.seconhand.dao.repos.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientsRepository clientsRepository;

    public void saveClient(Client client){
        this.clientsRepository.save(client);
    }
}
