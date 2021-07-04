package ru.dfr.task3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Вы не передали ни одного аргумента!");
            return;
        } else if (args.length > 5) {
            System.out.println("На вход может прийти лишь 5 аргументов!");
            return;
        }
        try {
            Queue queue = new Queue();
            for(String s : args) {
                ArrayList<Double> numbArr = queue.getStrArr(s);
                System.out.printf("%d\n", (int)queue.getMaxNumb(numbArr));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет в директории! Проверьте название файла...");
        }
    }
}
