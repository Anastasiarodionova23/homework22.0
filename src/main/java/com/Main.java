package main.java.com;

public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishment = 1100;
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        int finalBalance = initialBalance + replenishment + bonus;

        System.out.println("Начальный счет: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + replenishment + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
    }
}
