package service;

import model.Account;

import java.util.List;

public interface AccountService {

        String createAccount(Account account);
        //String accountNumber, String aacountHolder
        String deposit(Account account);
        //String accountNumber, double amount
        String withdraw(Account account);
        //String accountNumber, double amount
        String getBalance(String accountNumber);
        String cancelAccount(Account account);
        List<Account> getAccounts();

}
