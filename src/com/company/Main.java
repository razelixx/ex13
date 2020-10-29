package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

// Необходимо провести сравнение длины двух строк, которые были
// введены с клавиатуры и записаны всоответствующие переменные.
// Вывести на экран строку с наибольшей длиной.
// Если длины равны, вывести соответствующее сообщение.

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String firstRead = in.readLine();
        String secoundRead = in.readLine();

        int fR = firstRead.length();
        int sR = secoundRead.length();

        if (fR>sR){
            System.out.println(firstRead);
        }
            else if (fR<sR){
            System.out.println(secoundRead);
        }
            else System.out.println("Длины введенных строк равны");

    }
}
