package ru.dfr.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Quadrangle quadrangle = new Quadrangle();
            ArrayList<Double> arrayList = quadrangle.sort(quadrangle.getRange(quadrangle.getStrArr(args[0])));
            double min = arrayList.get(0);
            double max = arrayList.get(1);
            quadrangle.print(quadrangle.getZone(args[1], min, max));
        } catch (FileNotFoundException e) {
            System.out.println("Файл, на который вы ссылаетесь отсутствует в директории!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("У вас отсутствует один или более из обязательных параметров!");
        }
    }
}
