package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {

        String createAccount(AccountDto account);
        //String accountNumber, String aacountHolder
        String deposit(AccountDto account);
        //String accountNumber, double amount
        String withdraw(AccountDto account);
        //String accountNumber, double amount
        String getBalance(String accountNumber);
        String cancelAccount(AccountDto account);
        List<AccountDto> getAccounts();

}
