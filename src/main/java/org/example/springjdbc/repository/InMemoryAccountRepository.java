package org.example.springjdbc.repository;

import org.example.springjdbc.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryAccountRepository implements AccountRepository {

    @Override
    public void save(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public List<Account> findAll() {
        return List.of();
    }

    @Override
    public Account findById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
