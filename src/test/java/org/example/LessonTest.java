package org.example;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LessonTest {

    @Test
    void sumFiveItems() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5};

        assertEquals(15, lesson.sum(items));
    }

    @Test
    void sumFiveItems_Invalid() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5};

        assertNotEquals(10, lesson.sum(items));
    }

    @Test
    void sumFiveItems_WhenItemsHaveNegative() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5, -5};

        assertEquals(10, lesson.sum(items));
    }

    @Test
    void sumTwoFiveItems() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5};

        assertEquals(10, lesson.sumTwo(items, 0));
    }

    @Test
    void sumTwoFiveItems_Invalid() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5};

        assertNotEquals(10, lesson.sumTwo(items, 0));
    }

    @Test
    void sumTwoFiveItems_WhenItemsHaveNegative() {
        Lesson lesson = new Lesson();
        int[] items = new int[]{1, 2, 3, 4, 5, -5};

        assertEquals(10, lesson.sumTwo(items, 0));
    }

}
