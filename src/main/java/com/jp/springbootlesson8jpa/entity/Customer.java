package com.jp.springbootlesson8jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jp.springbootlesson8jpa.entity.listener.CustomerListener;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by 张俊鹏 on 3/23/2018
 */

@Entity
@Access(AccessType.FIELD)
@Table(name = "customers")
@EntityListeners( {CustomerListener.class} )
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 32)
    private String name;

    @JsonBackReference  //解决多个之间的递归调用问题
    @OneToOne
//    @JoinColumn(name = "credit_card_id")
//    @Fetch(FetchMode.JOIN)//会使用left join查询,只产生一条语句
     //@Fetch(FetchMode.SELECT)   会产生N+1条sql语句
     //@Fetch(FetchMode.SUBSELECT)  产生两条sql语句 第二条语句使用id in (…..)查询出所有关联的数据
    private CreditCard creditCard;

    @ManyToOne
    private Store store;

    @ManyToMany
    private Collection<Book> books;

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

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditCard=" + creditCard +
                ", store=" + store +
                ", books=" + books +
                '}';
    }
}
