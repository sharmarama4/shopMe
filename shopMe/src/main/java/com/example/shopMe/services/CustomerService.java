package com.example.shopMe.services;

import com.example.shopMe.models.Customer;
import com.example.shopMe.repository.CustomerRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;




}
