package ru.netology.services;

public class vocationService {
    public int calculate(int income, int expenses, int threshold) {   //income = 10000 and expenses = 3000
        int count = 0; //счётичк месяцов отдыха            // threshold - порог!
        int money = 0; //колчество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {   //тут проверяется есть ли достаточно $ чтобы не работать, а отдыхать (порог 20000 в первом примере и 150k во втором)
                count++; // елси true, то счётчик месяцев отдыха увеличивается на 1
                money = money - expenses; // и из оставшегося кол-ва денег вычитвается ежемесячные траты
                money = money / 3; //и траты на отдых ( / 3).
            } else {                      // если порог не превышен, то идём на работу.
                money = money + income;  // к оставшемуся кол-ву денег плюсуется ежемесячная получка
                money = money - expenses; // и вычитается ежемесячная трата
            }
        }
        return count; // возврат значения
    }
}
