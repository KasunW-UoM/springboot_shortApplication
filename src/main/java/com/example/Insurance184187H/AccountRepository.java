package com.example.Insurance184187H;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    Account findAccountByAccId(Integer accId);

}

