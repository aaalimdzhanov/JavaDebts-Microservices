package com.debts.debtsapi.repositorys;

import com.debts.debtsapi.models.DebtsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtRepositorys extends JpaRepository<DebtsModel, Long> {
}
