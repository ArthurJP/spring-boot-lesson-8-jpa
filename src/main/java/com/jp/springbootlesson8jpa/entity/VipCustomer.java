package com.jp.springbootlesson8jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 * Created by 张俊鹏 on 3/23/2018
 */

@Inheritance
@Entity
public class VipCustomer extends Customer {

    private Double discount;

    public VipCustomer(Double discount) {
        this.discount = discount;
    }
}
