package com.example.Insurance184187H;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/add")
    public String addAccount(@RequestParam Integer id,
                             @RequestParam String username,
                             @RequestParam String fullname,
                             @RequestParam Double bal,
                             @RequestParam String email){
        Account account = new Account();
        account.setAccId(id);
        account.setUsername(username);
        account.setFullname(fullname);
        account.setBalance(bal);
        account.setEmail(email);
        accountRepository.save(account);
        return "Acount Details Added to Database";

    }

        @GetMapping("/list")
        public Iterable<Account> listAccount(){

            return accountRepository.findAll();
        }

        @GetMapping("/search/{accId}")
    public Account findAccountById(@PathVariable Integer accId){
        return accountRepository.findAccountByAccId(accId);
        }

}
