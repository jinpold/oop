package controller;
import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {


    //싱글톤 패턴
    // 생성자를 알트 + insert로 만든다.
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }
    //  new AccountServiceImpl -> AccountServiceImpl.getInstance(); 바꿔준다.
    // 싱글톤 패턴 종료.


    public String createAccount(Scanner sc) { // 계좌생성
        System.out.println("입력하세요");
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) { // 입금
        return accountService.deposit(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) { // 출금
        return accountService.withdraw(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance(Scanner sc) { // 잔고확인
        return accountService.getBalance(sc.next());
    }

    public String cancelAccount(Scanner sc) {
        return accountService.cancelAccount(null);
    }

    public String getAccount(Scanner sc) {
        return accountService.cancelAccount(null);
    }
}
