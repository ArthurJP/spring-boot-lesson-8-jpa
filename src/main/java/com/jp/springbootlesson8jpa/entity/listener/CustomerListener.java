package com.jp.springbootlesson8jpa.entity.listener;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

/**
 * 客户持久化监听器
 * 可以在此处添加一些需要的数据，比如防篡改数据等
 * Created by 张俊鹏 on 3/23/2018
 */
public class CustomerListener {

    @PrePersist
    public void perPersist(Object source) {
        System.out.println( "@PrePersist:" + source );
    }

    @PostPersist
    public void postPersist(Object source){
        System.out.println("@PostPersist:"+source);
    }
}
