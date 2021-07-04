package ru.dfr.task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HourRange {
    public ArrayList<Double> getDoubleArr(String arr) throws FileNotFoundException {
        ArrayList<Double> arrList = new ArrayList<>();
        File f = new File(arr);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String str2 = str.replace("\\", "")
                    .replace("n", "")
                    .replace(":", ".")
                    .replace(" ", "/");
            String[] s = str2.split("/");
            String[] strHourBegin = s[0].split("\\.");
            String[] strHourEnd = s[1].split("\\.");

            int numbHourBegin = Integer.parseInt(strHourBegin[0]);
            int numbHourEnd = Integer.parseInt(strHourEnd[0]);
            int diffHours = (numbHourEnd - 1) - numbHourBegin;
            if (diffHours < 0) {
                diffHours = 0;
            }

            int numbMinuteBegin = Integer.parseInt(strHourBegin[1]);
            int numbMinuteEnd = Integer.parseInt(strHourEnd[1]);
            int diffMinutes = Math.abs((60 - numbMinuteEnd) - (60 - numbMinuteBegin));

            String output = "" + diffHours + "." + diffMinutes;

            arrList.add(Double.parseDouble(output));
        }
        return arrList;
    }

    public ArrayList<String> getStrArr(String arr) throws FileNotFoundException {
        ArrayList<String> arrList = new ArrayList<>();
        File f = new File(arr);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String str2 = str.replace("\\", "")
                    .replace("n", "")
                    .replace(":", ".");
            arrList.add(str2);
        }
        return arrList;
    }

    public double getMaxNumb(ArrayList<Double> numbs) {
        Collections.sort(numbs);
        return numbs.get(numbs.size() - 1);
    }

    public double getMinNumb(ArrayList<Double> numbs) {
        Collections.sort(numbs);
        return numbs.get(0);
    }

    public int indexNumb(double numb, ArrayList<Double> numbs) {
        return numbs.indexOf(numb);
    }

    public int countNumbInList(ArrayList<Double> numbs, double numb) {
        int count = 0;
        for(int i = 0; i < numbs.size(); i++) {
            if (numbs.get(i) == numb) {
                count++;
            }
        }
        return count;
    }
}
