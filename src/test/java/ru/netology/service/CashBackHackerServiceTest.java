package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackerServiceTest {

    @Test
    public void remainNormalValueAmountTest() {
        CashBackHackerService cashBackHackerService = new CashBackHackerService();
        int amount = 900;
        int result = cashBackHackerService.remain(amount);
        Assertions.assertEquals(100, result);
    }

    @Test
    public void remainNegativeWasteTest() {
        CashBackHackerService cashBackHackerService = new CashBackHackerService();
        int amount = -900;
        int result = cashBackHackerService.remain(amount);
        Assertions.assertEquals(100, result); // Нет защиты от отрицательного значения amount!
    }

    @Test
    public void remainZeroWasteTest() {
        CashBackHackerService cashBackHackerService = new CashBackHackerService();
        int amount = 0;
        int result = cashBackHackerService.remain(amount);
        Assertions.assertEquals(1000, result);
    }
}
