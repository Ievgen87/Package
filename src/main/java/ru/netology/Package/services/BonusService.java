package ru.netology.Package.services;

public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха

                System.out.println("Месяц " + month + " Денег " + money + " Буду отдыхать " + " Потратил " + expenses + " затем еще " + ((money - expenses) * 2) / 3);
                money = (money - expenses) / 3;

            } else {

                System.out.println("Месяц " + month + " Денег " + money + " Заработал " + income + " Потратил " + expenses);
                money = money + income - expenses;
            }
        }
        System.out.println("Итого месяцев отдыха " + count);
        return count;
    }
}
