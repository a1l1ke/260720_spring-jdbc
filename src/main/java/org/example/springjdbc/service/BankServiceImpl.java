package org.example.springjdbc.service;

import org.example.springjdbc.dto.AccountFormDTO;
import org.example.springjdbc.dto.AccountViewDTO;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
    @Override
    public void makeAccount(AccountFormDTO dto) {

    }

    @Override
    public void changeAccount(AccountFormDTO dto) {

    }

    @Override
    public AccountViewDTO findAccount(long id) {
        return null;
    }

    @Override
    public void deleteAccount(long id) {

    }
}
