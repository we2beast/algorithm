package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson {

    Integer sum(int[] items) {
        if (items.length == 0) {
            return 0;
        }

        int num = 0;

        for (int n : items) {
            num += n;
        }

        return num;
    }

    int sumTwo(int[] items, int index) {
        if (items.length == 0) {
            return 0;
        }

        int result = items[index];
        System.out.println(result);

        if (++index < items.length) {
            result += sumTwo(items, index);
        }

        return result;
    }

}
