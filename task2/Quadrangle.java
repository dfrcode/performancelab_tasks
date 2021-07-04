package ru.dfr.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Quadrangle {
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

    public int getPosition(double num1, double num2, double begin, double end) {
        if (((num1 < begin && num2 < end) && num2 > begin)
                || ((num1 > begin && num2 > end) && num1 < end)
                || (num1 > begin && num2 > end)
                || (num1 == begin && num2 > end)
                || (num1 < begin && num2 == end)
                || (num1 == begin && num2 < begin)
                || (num1 > end && num2 == end)
                || (num1 < begin && num2 < begin)
                || (num1 > end && num2 > end)
        ) {
            return 3;
        } else if (num1 == begin && num2 == end
                || num2 == begin && num1 == end
                || num1 == begin && num2 == begin
                || num1 == end && num2 == end
        ) {
            return 0;
        } else if (((num1 == begin && num2 < end) && num2 > begin)
                || ((num1 > begin && num2 == end) && num1 < end)
        ) {
            return 1;
        } else {
            return 2;
        }
    }

    public ArrayList<Integer> getZone(String arr, double begin, double end) throws FileNotFoundException {
        ArrayList<Integer> arrList = new ArrayList<>();
        File f = new File(arr);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String str2 = str.replace("\\", "")
                    .replace("n", "")
                    .replace(":", ".");
            String[] s = str2.split(" ");
            Double[] numbs = new Double[2];
            numbs[0] = Double.parseDouble(s[0]);
            numbs[1] = Double.parseDouble(s[1]);

            int n = this.getPosition(numbs[0], numbs[1], begin, end);
            arrList.add(n);
        }
        return arrList;
    }

    public void print(ArrayList<Integer> numbs) {
        for (Integer n : numbs) {
            System.out.println(n);
        }
    }

    public ArrayList<Double> getRange(ArrayList<String> arr) {
        List<Double> numbers = new ArrayList<>();
        for (String s : arr) {
            String[] str = s.split(" ");
            numbers.add(Double.parseDouble(str[0]));
        }
        Set<Double> numbs = new HashSet<>(numbers);
        return new ArrayList<>(numbs);
    }

    public ArrayList<Double> sort(ArrayList<Double> numbs) {
        ArrayList<Double> newNumbs = new ArrayList<>();
        Collections.sort(numbs);
        for(Double n : numbs) {
            newNumbs.add(n);
        }
        return newNumbs;
    }
}
