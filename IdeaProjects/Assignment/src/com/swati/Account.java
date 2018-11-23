package com.swati;

public abstract class Account {

    protected int AccountNo;
    protected String CustomerName;
    protected double Balance;

    public Account (int AccountNo, String CustomerName, double Balance){
        this.AccountNo = AccountNo;
        this.CustomerName = CustomerName;
        this.Balance = Balance;
    }

    public void Deposit( double DepositAmount){
        System.out.println(DepositAmount);
    }
    public void Withdraw(double WithdrawAmount){
        System.out.println(WithdrawAmount);
    }
}
