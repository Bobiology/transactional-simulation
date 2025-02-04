package com.techhub.springtransactions.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Table(name = "user_info")
@Entity
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String mobile;
    @OneToOne
    private Address address;
}