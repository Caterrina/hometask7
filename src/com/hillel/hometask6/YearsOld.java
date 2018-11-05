package com.hillel.hometask6;

import java.util.Scanner;

public class YearsOld {
    public static void main (String [] args) {
     System.out.println(" Уважаемый абонент, введите пожалуйста Ваш год рождения!!! ");
        Scanner scanner = new Scanner( System.in);
       int number = scanner.nextInt();
       int x = 2018;
       int y = number;
            int result = x - y;
            System.out.println("Спасибо");
            System.out.println("Ваш возраст: " + result);




    }
}

