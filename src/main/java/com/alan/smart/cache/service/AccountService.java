package com.alan.smart.cache.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.alan.smart.cache.repository.po.AccountPo;

public interface AccountService {

    Optional<AccountPo> getAccount(String username);
    
    Optional<AccountPo> getAccount(BigInteger accountId);

    void saveAccount(AccountPo account);
    
    List<AccountPo> getAllAccounts();
    
    void clearAllCache();
    
    void clear(BigInteger accountId);
    
}