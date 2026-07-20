package org.example.springjdbc.service;

import org.example.springjdbc.dto.AccountFormDTO;
import org.example.springjdbc.dto.AccountViewDTO;

public interface BankService {
    void makeAccount(AccountFormDTO dto);

    void changeAccount(AccountFormDTO dto);

    AccountViewDTO findAccount(long id);

    void deleteAccount(long id);
}
