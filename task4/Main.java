package ru.dfr.task4;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            HourRange hourRange = new HourRange();

            ArrayList<String> strArr = hourRange.getStrArr(args[0]);
            ArrayList<Double> numbArr = hourRange.getDoubleArr(args[0]);

            double min = hourRange.getMinNumb(numbArr);
            int countMin = hourRange.countNumbInList(numbArr, min);
            double max = hourRange.getMaxNumb(numbArr);
            int countMax = hourRange.countNumbInList(numbArr, max);

            int indexMin = hourRange.indexNumb(min, numbArr);
            int indexMax = hourRange.indexNumb(max, numbArr);

            for(int i = 0; i < countMax; i++) {
                System.out.println(strArr.get(indexMax));
            }
            for(int i = 0; i < countMin; i++) {
                System.out.println(strArr.get(indexMin));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл, на который вы ссылаетесь отсутствует в директории!");
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Вы не передали ни одного параметра! Либо ваш файл пустой!");
    }

    }
}
