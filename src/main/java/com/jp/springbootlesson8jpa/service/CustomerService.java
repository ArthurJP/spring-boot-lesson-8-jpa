package com.jp.springbootlesson8jpa.service;

import com.jp.springbootlesson8jpa.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by 张俊鹏 on 3/23/2018
 */
@Service
@Transactional
public class CustomerService {
    @PersistenceContext
    private EntityManager entityManager;

    public void addCustomer(Customer customer) {
        entityManager.persist( customer );
    }

    public Customer getCustomerById(Long id) {
        return entityManager.find( Customer.class, id );
    }
}
