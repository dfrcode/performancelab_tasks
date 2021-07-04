package ru.dfr.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {
    public double getSumNumbers(String[] arr) throws FileNotFoundException {
        int nums = 0;
        for (String s : arr) {
            File f = new File(s);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                nums += Integer.parseInt(sc.nextLine());
            }
        }
        return nums;
    }

    public ArrayList<Integer> setNumbersArray(String[] arr) throws FileNotFoundException {
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : arr) {
            File f = new File(s);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                nums.add(Integer.parseInt(sc.nextLine()));
            }
        }
        return nums;
    }

    public int getMinNumber(ArrayList<Integer> arr) {
        int min = 0;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }

    public int getMaxNumber(ArrayList<Integer> arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    public int getMedian(ArrayList<Integer> arr) {
        Collections.sort(arr);
        if (arr.size() % 2 == 0) {
            return (arr.get((arr.size() / 2) - 1) + arr.get((arr.size() / 2) + 1)) / 2;
        } else {
            return arr.get(arr.size() / 2);
        }
    }

    public double getPercentile(ArrayList<Integer> arr, double num) {
        Collections.sort(arr);
        if (num == 0) {
            return arr.get(0);
        }
        return arr.get(((int) Math.ceil((num / 100) * arr.size())) - 1);
    }
}
