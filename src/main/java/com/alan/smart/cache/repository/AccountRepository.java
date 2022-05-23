package com.alan.smart.cache.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alan.smart.cache.repository.po.AccountPo;

import java.lang.String;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountPo, BigInteger> {
    
    List<AccountPo> findByUsername(String username);
    
}
