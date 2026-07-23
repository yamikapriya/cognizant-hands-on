package org.example.account.controller;

import org.example.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(number, "savings", 234343);
    }
}
