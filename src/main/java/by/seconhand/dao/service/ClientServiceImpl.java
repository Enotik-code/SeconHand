package by.seconhand.dao.service;

import by.seconhand.bean.Client;
import by.seconhand.dao.repos.ClientsRepository;
import lombok.SneakyThrows;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl {


    @Autowired
    private ClientsRepository clientsRepository;

    private static final Logger log = Logger.getLogger(ClientServiceImpl.class);

    public List<Client> listOfClients(){
        log.info("Returned list of clients");
        return clientsRepository.findAll();
    }

}
