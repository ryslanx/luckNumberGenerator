package com.company;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] integers = new int[100];
        for (int i = 0; i < 100; i++) {
            integers[i] = i+1;
        }
        integers = luckyNumber(integers);
        ArrayList<Integer> integers2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (integers[i] == 0) {
                continue;
            } else {
                integers2.add(integers[i]);
            }
        }
        System.out.println(integers2.toString());
    }

    public static int[] luckyNumber(int[] integers) {
        int delimiter = 2;
        int pool = 2;
        while (delimiter < 50) {
            int counter = 0;
            for (int i = 0; i < 100; i++) {
                if (integers[i] > 0) {
                    counter++;
                    if (counter == delimiter) {
                        integers[i] = 0;
                        counter = 0;
                    }
                }
            }
            counter = 0;
            for (int i = 0; i < 100; i++) {
                if (integers[i] > 0) {
                    counter++;
                    if (counter == pool) {
                        delimiter = integers[i];
                        break;
                    }
                }
            }
            pool++;
        }
        return integers;
    }
}