package com.swati;

public class SavingsAccount extends Account{

    private String AccountType = "SavingsAccount";

    public SavingsAccount(int AccountNo, String CustomerName, double Balance, String AccountType){
        super (AccountNo, CustomerName,Balance);
        this.AccountType = AccountType;

    }

    


}
