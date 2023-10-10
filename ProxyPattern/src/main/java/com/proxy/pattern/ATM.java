package com.proxy.pattern;

public class ATM implements Account{ // This is proxy to bank account object not real
    
    public void withdraw() {
        //Access using actual object. You can also have checks on withdraw to achieve authentication or pin is correct or not.
        BanAccount bankAccount = new BanAccount();
        bankAccount.withdraw();
    }

    
    public void getAccountNumber() {

    }
}
