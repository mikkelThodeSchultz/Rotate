package com.company;

import java.util.ArrayList;

public class Rotate {

    private ArrayList<Integer> listOfNumbers = new ArrayList<>();

    public void rotate(int number) {
        int o = 0;
        if (number >= 0) {
            for (int i = number + 1; o < 6; i++) {
                while (i > 6) {
                    i = i - 6;
                }
                o++;
                listOfNumbers.add(i);
            }

        } else {

            while (number < -6) {
                number = number + 6;
            }
            number = number + 7;
            for (int i = 0; i < 6; i++) {
                listOfNumbers.add(number);
                number++;
                if (number == 7) {
                    number = number - 6;
                }
            }
        }
        System.out.println(listOfNumbers);
    }

}


