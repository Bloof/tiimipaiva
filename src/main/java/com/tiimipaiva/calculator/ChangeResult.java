package com.tiimipaiva.calculator;

import com.tiimipaiva.enums.MoneyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
public class ChangeResult {
    Integer coins;
    MoneyType type;

    public static boolean isCoinsAvailable(ChangeResult result) {
        return result.coins != 0;
    }
}
