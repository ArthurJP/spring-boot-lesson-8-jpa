package com.jp.springbootlesson8jpa.entity;


import javax.persistence.*;
import java.util.Collection;

/**
 * Created by 张俊鹏 on 3/23/2018
 *
 * 现实中店铺和用户是多对多关系，这里只是为了验证，使用了多对一关系
 */

@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "store")
    private Collection<Customer> customers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }


}
