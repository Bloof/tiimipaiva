package com.tiimipaiva.calculator;

import com.tiimipaiva.enums.MoneyType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ChangeCalculator {

    public List<ChangeResult> calculateChange (BigDecimal changeAmount) {

        var change = new ArrayList<ChangeResult>();

        for (MoneyType type : MoneyType.values()) {
            var coins = calculateCoins(changeAmount, type.getAmount());
            changeAmount = changeAmount.subtract(type.getAmount().multiply(BigDecimal.valueOf(coins)));
            change.add(new ChangeResult(coins, type));
        }

        return change
                .stream()
                .filter(ChangeResult::isCoinsAvailable)
                .collect(Collectors.toList());

    }

    private int calculateCoins(BigDecimal moneyLeft, BigDecimal moneyTypeAmount) {
        var coins = 0;
        for (var i = moneyLeft; i.compareTo(moneyTypeAmount) >= 0; i = i.subtract(moneyTypeAmount)) {
            coins++;
        }
        return coins;
    }


}
