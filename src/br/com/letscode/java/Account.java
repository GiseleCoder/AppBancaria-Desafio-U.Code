package br.com.letscode.java;

import java.math.BigDecimal;

public class Account {
    protected String name;
    protected int numberAccount = 0;
    protected int identifierOwnerAccount;
    protected float balanceAccount;

    public Account() {

    }

    public Account(String name, int numberAccount, float balanceAccount) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.identifierOwnerAccount += 1;
        this.balanceAccount = balanceAccount;
        createAccount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void setIdentifierOwnerAccount(int identifierOwnerAccount) {
        this.identifierOwnerAccount = identifierOwnerAccount;
    }

    public void setBalanceAccount(float balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public String getName() {
        return name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public int getIdentifierOwnerAccount() {
        return identifierOwnerAccount;
    }

    public float getBalanceAccount() {
        return balanceAccount;
    }

    //abrir conta, sacar, depositar, transferência, investir, consultar saldo
    public void createAccount() {
        this.numberAccount++;

    }

    public void cashWithdrawal(float cash) {
        System.out.println("Sacar dinheiro.");
        if (this.balanceAccount > cash) {
            this.balanceAccount = -cash;
        }
        System.out.println("Não há saldo suficiente.");
        return;
    }

    public void cashDeposit(float cash) {
        System.out.println("Depositar dinheiro.");
        this.balanceAccount += cash;
        return;
    }

    public void cashTransfer(int accountReceives, float cash) {
        if (this.balanceAccount > cash) {
            this.balanceAccount = -cash;
            accountReceives += cash;
        }
        System.out.println("Não há saldo suficiente.");
    }

    public void cashInvest(float cash) {
        System.out.println("Investir dinheiro.");
        this.balanceAccount += cash;
        return;
    }

    public float balanceInquiry(){
        return balanceAccount;

    }
}