package com.tiimipaiva.enums;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum MoneyType {

    TWO_EURO(BigDecimal.valueOf(2.00)),
    ONE_EURO(BigDecimal.valueOf(1.00)),
    FIFTY_CENT(BigDecimal.valueOf(0.5)),
    TWENTY_CENT(BigDecimal.valueOf(0.2)),
    TEN_CENT(BigDecimal.valueOf(0.1)),
    FIVE_CENT(BigDecimal.valueOf(0.05));

    private BigDecimal amount;

    MoneyType(BigDecimal amount){
        this.amount = amount;
    }

}
