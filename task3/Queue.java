package ru.dfr.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    public ArrayList<Double> getStrArr(String arr) throws FileNotFoundException {
        ArrayList<Double> arrList = new ArrayList<>();
        int i = 0;
        File f = new File(arr);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String str2 = str.replace("\\", "").replace("n", "");
            double numb = Double.parseDouble(str2);
            arrList.add(numb);
        }
        i++;
        arrList.add((double)i);
        return arrList;
    }

    public double getMaxNumb(ArrayList<Double> numbs) {
        double max = numbs.get(0);
        for(int i = 0; i < numbs.size(); i++) {
            if(numbs.get(i) > max){
                max = numbs.get(i);
            }
        }
        return numbs.indexOf(max) + 1;
    }
}
