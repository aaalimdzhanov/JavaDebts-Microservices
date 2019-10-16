package com.debts.debtsapi.controllers;

import com.debts.debtsapi.models.DebtsModel;
import com.debts.debtsapi.models.UserModel;
import com.debts.debtsapi.repositorys.DebtRepositorys;
import com.debts.debtsapi.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/debt")
public class DebtsController {
    @Autowired
    DebtRepositorys debtRepositorys;

    @GetMapping("/getAllDebts")
    public List<DebtsModel> getAllDebts(){

        List<DebtsModel> debtsModelList = debtRepositorys.findAll();

        return debtsModelList;

    }
}
