package com.example.sqldao.controller;

import com.example.sqldao.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public List<String> listOfProducts(@RequestParam("name") String name) {
        return service.listOfProducts(name);
    }
}
