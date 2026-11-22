package dev.payments.app.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long balance;

    @Column
    private String currency;


    @Column(name="first_amount")
    private long initial_balance;

    @Column
    private LocalDateTime created_time;

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

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(Long initial_balance) {
        this.initial_balance = initial_balance;
    }

    public LocalDateTime getcreated_time() {
        return created_time;
    }

    public void setcreated_time(LocalDateTime created_time) {
        this.created_time = created_time;
    }

}
