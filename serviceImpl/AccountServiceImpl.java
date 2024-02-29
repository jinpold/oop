package serviceImpl;

import model.AccountDto;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    List<AccountDto> List;

    private AccountServiceImpl() {
        this.List = new ArrayList<>();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(AccountDto account) {
        return "";
    }

    @Override
    public String deposit(AccountDto account) {
        return null;
    }

    @Override
    public String withdraw(AccountDto account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(AccountDto account) {
        return null;
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}
