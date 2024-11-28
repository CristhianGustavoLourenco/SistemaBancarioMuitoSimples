/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import exceptions.DomainException;

/**
 *
 * @author crist
 */
public class Account {

    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;

    public Account() {
    }
    
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    
    

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    

    public void deposit(Double amount) {
        balance += amount;
    }
    
    public void withdraw(Double amount){
        validadwithdraw(amount);
        balance -= amount;
    }
    public void validadwithdraw(Double amount) throws DomainException{
        
        if(amount > balance){
            throw new DomainException ("Saldo insuficiente");
        }
        if(amount > withdrawLimit){
            throw new DomainException("A quantia excede o limite de saque");
        }
    }

    @Override
    public String toString() {
        return "Numero da Conta: " + number + "\nNome do Cliente: " + holder + "\nSaldo: " + balance + "\nLimite para Saque: " + withdrawLimit + '}';
    }
    
    
}
