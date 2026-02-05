package com.cms_project.democms.service;

import com.cms_project.democms.model.Customer;
import com.cms_project.democms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repo;

    public List<Customer> findAll() {
        return repo.findAll();
    }
}