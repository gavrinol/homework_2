package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задание 1 и 2
        System.out.println("Напишите какую ОС вы используете: 0 - IOS, 1 - Android");
        Scanner Os = new Scanner(System.in);
        int clientOS = Os.nextInt();
        System.out.println("Какого года производства ваш телефон?");
        Scanner year = new Scanner(System.in);
        int phoneYear = year.nextInt();
        if (clientOS == 0 && phoneYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && phoneYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientOS==0 && phoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS==1 && phoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Что-то пошло не так");
        }
        System.out.println();

        // Задание 3
        System.out.println("Введите год");
        Scanner time = new Scanner(System.in);
        int thisYear = time.nextInt();
        if (thisYear % 4 == 0 && thisYear % 100 !=0 || thisYear % 400 == 0){
            System.out.println("Этот год високосный");
        }else {
            System.out.println("Этот год не високосный");
        }
        System.out.println();

        // Задание 4
        System.out.println("В скольких киллометрах доставка?");
        Scanner delivery = new Scanner(System.in);
        int deliveryDistance = delivery.nextInt();
        int days = 0;
        if (deliveryDistance <= 20){
            days++;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 20 && deliveryDistance <= 60){
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            days = days + 3;
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Мы к вам не поедем");
        }
        System.out.println();

        //Задание 5
        System.out.println("Номер месяца?");
        Scanner month = new Scanner(System.in);
        int monthNumber = month.nextInt();
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет(");
        }

    }

}