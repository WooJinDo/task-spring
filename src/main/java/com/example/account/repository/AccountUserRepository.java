package com.example.account.repository;

import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* JpaRepository<AccountUser, Long>
* AccountUser - 테이블에 대한 엔티티
* Long - pk id의 타입
* */
@Repository
public interface AccountUserRepository extends JpaRepository<AccountUser, Long> {
}
