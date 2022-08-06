package com.logic;

import com.logic.model.Account;
import com.logic.service.AccountService;

import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        AccountService as = new AccountService();

        while (true) {

            System.out.println("Please enter an example number");
            while (!scan.hasNextInt()) {
                scan.nextLine();
            }
            int example = scan.nextInt();

            Account a = new Account(example);

            as.insertExample(a);
            Thread.sleep(3000);
            System.out.println("Press 1 to end program");
            scan.next();
            break;
        }

    }
}
