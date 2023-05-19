package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        vocationService service = new vocationService();
        int count = service.calculate(100000, 60000, 150000);
        System.out.println("Количество месяцев отдыха в году: " +count);
    }
}