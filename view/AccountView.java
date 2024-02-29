package view;
import controller.AccountController;
import controller.UserController;
import model.AccountDto;

import java.util.List;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {

        AccountController accountController = new AccountController();
        while (true) {
            System.out.println("[Account] 0-Exit\n " +
                    "1-create\n " +
                    "2-Deposit\n " +
                    "3-Withdraw\n " +
                    "4-Balance\n" +
                    "5-RemoveAccount\n ");
            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("1-Create Account");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println("2-Deposit");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println("3-Withdraw");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("4-Balance");
                    String temp = accountController.getBalance(sc);
                    break;
                case "5":
                    System.out.println("5-RemoveAccount");
                    System.out.println(accountController.cancelAccount(sc));
                    break;
                case "6":
                    System.out.println("6-Account List");
                    System.out.println(accountController.getAccount(sc));
                    break;

            }
        }
    }
}