package com.moneymanager.backend.model;

import jakarta.persistence.*; // Meka import karanna

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID eka auto increment wenna
    private Long id;

    private Double amount;
    private String transactionType;

    public Transaction() {}


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

}