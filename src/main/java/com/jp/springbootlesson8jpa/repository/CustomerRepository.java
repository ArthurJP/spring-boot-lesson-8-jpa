package com.jp.springbootlesson8jpa.repository;

import com.jp.springbootlesson8jpa.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * Created by 张俊鹏 on 3/31/2018
 * 采用repository代替传统的dao，因为以后的数据源可能是sql，noSql，hbase
 */
@Repository
@Transactional
public class CustomerRepository extends SimpleJpaRepository<Customer, Long> {

    @Autowired
    public CustomerRepository(EntityManager em) {
        super( Customer.class, em );
    }

}
