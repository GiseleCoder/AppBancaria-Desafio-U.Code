package br.com.letscode.java;

import java.math.BigDecimal;

public class CorporateAccount extends Account{
    public CorporateAccount(){

    }

    public void setNumberAccount(int numberAccount) {
        super.setNumberAccount(numberAccount);
    }

    public void cashWithdrawalCorp(float rate, float cash) {
        System.out.println("Sacar dinheiro.");
        if (this.balanceAccount > cash) {
            this.balanceAccount = balanceAccount - (cash + (cash * rate));
        }
        return;
    }

    public void cashTransfer(int accountReceives, float cash) {
        if (this.balanceAccount > cash) {
            this.balanceAccount = -cash;
            accountReceives += cash;
        }
        System.out.println("Não há saldo suficiente.");
    }

    public void cashTransferCorp(float rate, int accountReceives, float cash) {
        if (this.balanceAccount > cash) {
            this.balanceAccount = balanceAccount - (cash + (cash * rate));
            accountReceives += cash;
        }
        System.out.println("Não há saldo suficiente.");
    }

    public void cashInvest(float cash) {
        System.out.println("Investir dinheiro.");
        this.balanceAccount += cash;
        return;
    }

    public void cashInvestCorp(float financialIncomming, float cash) {
        System.out.println("Transferir  dinheiro.");
        this.balanceAccount += (cash + (cash * financialIncomming));
        return;
    }
}
