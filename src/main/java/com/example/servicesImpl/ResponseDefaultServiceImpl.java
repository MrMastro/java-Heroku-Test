package com.example.servicesImpl;

import com.example.models.ResponseDefault;
import com.example.services.ResponseDefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //-> dico che questo componente è un service in modo da automatizzare la sua creazione con @Autowired
public class ResponseDefaultServiceImpl implements ResponseDefaultService {
    public ResponseDefault getResponseMessage(String message){
        return new ResponseDefault(message);
    }
}