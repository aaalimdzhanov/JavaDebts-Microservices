package com.debts.debtsapi.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Debts")
public class DebtsModel {
    @Id
    @Column(name = "id")
    private long userId;

    @Column(name = "creator_id")
    private long creatorId;

    @Column(columnDefinition = "ENUM('UZS','RUB','USD','KZT','EURO')")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Column(name = "debt_create_date")
    private LocalDateTime debtCreateDate;

    @Column(name = "debt_return_date")
    private LocalDateTime debtReturnDate;

    @Column(name = "debt_deadline_date")
    private LocalDateTime debtDeadlineDate;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }



    public LocalDateTime getDebtCreateDate() {
        return debtCreateDate;
    }

    public void setDebtCreateDate(LocalDateTime debtCreateDate) {
        this.debtCreateDate = debtCreateDate;
    }

    public LocalDateTime getDebtReturnDate() {
        return debtReturnDate;
    }

    public void setDebtReturnDate(LocalDateTime debtReturnDate) {
        this.debtReturnDate = debtReturnDate;
    }

    public LocalDateTime getDebtDeadlineDate() {
        return debtDeadlineDate;
    }

    public void setDebtDeadlineDate(LocalDateTime debtDeadlineDate) {
        this.debtDeadlineDate = debtDeadlineDate;
    }


}
