package org.example;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.example.Gender.MALE;
import static org.example.Gender.FEMALE;
//В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением созданного перечисления.
//Добавить геттеры, сеттеры.
//Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
//принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
//а мужчин с 23 февраля, если сегодня соответствующий день.
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        List<Employe> employeList = new ArrayList<>();
        Buyer buyer = new Buyer("Paul", MALE);
        Buyer buyer1 = new Buyer("Katya", FEMALE);
        System.out.println(buyer + " " + buyer1);

        Employe employe = new Employe("Paul", MALE);
        Employe employe2 = new Employe("Nadya", FEMALE);
        employeList.add(employe);
        employeList.add(employe2);
        employe.congratulations(employeList, date);
    }
}