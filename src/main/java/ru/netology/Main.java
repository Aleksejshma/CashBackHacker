package ru.netology;

import ru.netology.service.CashBackHackerService;

public class Main {

    public static void main(String[] args) {

        CashBackHackerService cashBackHackerService = new CashBackHackerService();
        int rez = cashBackHackerService.remain(900);
        System.out.println(rez);
    }
}
