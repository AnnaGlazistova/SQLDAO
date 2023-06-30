package com.example.sqldao.service;

import com.example.sqldao.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;
    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> listOfProducts(String name) {
        return repository.getProductName(name);
    }

}
