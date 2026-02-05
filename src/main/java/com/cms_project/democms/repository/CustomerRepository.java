package com.cms_project.democms.repository;

import org.springframework.stereotype.Repository;
import com.cms_project.democms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}