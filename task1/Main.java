package ru.dfr.task1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();

            // 90 перцентиль
            System.out.printf("%.2f\n", calc.getPercentile(calc.setNumbersArray(args), 90));
            // медиана
            System.out.printf("%.2f\n", (double) calc.getMedian(calc.setNumbersArray(args)));
            // максимальное значение
            System.out.printf("%.2f\n", calc.getMaxNumber(calc.setNumbersArray(args)));
            // минимальное значение
            System.out.printf("%.2f\n", calc.getMinNumber(calc.setNumbersArray(args)));
            // среднее значение
            System.out.printf("%.2f\n", calc.getSumNumbers(args) / (calc.setNumbersArray(args)).size());
        } catch (FileNotFoundException e) {
            System.out.println("Файл, на который вы ссылаетесь отсутствует в директории!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы не ввели название файла! Или в выбранном вами файле отсутствуют данные!");
        }
    }
}
