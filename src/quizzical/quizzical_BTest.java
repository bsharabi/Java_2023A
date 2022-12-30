package quizzical;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import quizzical.quizzical_B.Car;

import static org.junit.jupiter.api.Assertions.*;

class quizzical_BTest {
    int grade = 0;

    @Test
    void TestArrayStringsAreEqual() {
        boolean ans;
        ans = quizzical_B.arrayStringsAreEqual(new String[]{"a", "bc"}, new String[]{"abc"});
        assertTrue(ans);
        ans = quizzical_B.arrayStringsAreEqual(new String[]{"a", "bcd"}, new String[]{"abc"});
        assertFalse(ans);
        ans = quizzical_B.arrayStringsAreEqual(new String[]{"ab", "bc"}, new String[]{"ba", "bc"});
        assertFalse(ans);
        ans = quizzical_B.arrayStringsAreEqual(new String[]{"ab", "bbc"}, new String[]{"abb", "bc"});
        assertTrue(ans);
    }

    @Test
    void TestRestoreString() {
        String ans;
        ans = quizzical_B.restoreString("AliceBobAnd", new int[]{0, 1, 2, 3, 4, 8, 9, 10, 5, 6, 7});
        assertEquals(ans, "AliceAndBob");

        ans = quizzical_B.restoreString("IsJavaLove", new int[]{4, 5, 0, 1, 2, 3, 6, 7, 8, 9});
        assertEquals(ans, "JavaIsLove");

        ans = quizzical_B.restoreString("9876543210", new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        assertEquals(ans, "0123456789");

        ans = quizzical_B.restoreString("JavaIsFun", new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(ans, "JavaIsFun");
    }

    @Test
    void TestFindNumbers() {
        int ans;
        ans = quizzical_B.findNumbers(new int[]{0, 1, 2, 3, 4, 8, 9, 10, 5, 6, 7});
        assertEquals(ans, 1);

        ans = quizzical_B.findNumbers(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(ans, 0);

        ans = quizzical_B.findNumbers(new int[]{0, 1, 2, 3, 485, 3, 5, 2, 0, 8, 9, 10, 5, 6, 7});
        assertEquals(ans, 1);

        ans = quizzical_B.findNumbers(new int[]{0, 1, 23, 33, 382, 498, 163, 43, 8, 9, 10, 5, 6, 7});
        assertEquals(ans, 4);
    }

    @Test
    void TestSmallerNumbersThanCurrent() {
        int[] ans;
        ans = quizzical_B.smallerNumbersThanCurrent(new int[]{0, 1, 2, 3, 4, 8, 9, 10, 5, 6, 7});
        assertArrayEquals(ans, new int[]{0, 1, 2, 3, 4, 8, 9, 10, 5, 6, 7});

        ans = quizzical_B.smallerNumbersThanCurrent(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        assertArrayEquals(ans, new int[]{0, 1, 2, 3, 4, 5, 6, 7,8});

        ans = quizzical_B.smallerNumbersThanCurrent(new int[]{0, 1, 2, 3, 485, 3, 5, 2, 0, 8, 9, 10, 5, 6, 7});
        assertArrayEquals(ans, new int[]{0, 2, 3, 5, 14, 5, 7, 3, 0, 11, 12, 13, 7, 9, 10});

        ans = quizzical_B.smallerNumbersThanCurrent(new int[]{0,1,23,33,382,498,163,43,8,9,10,5,6,7});
        assertArrayEquals(ans, new int[]{0, 1, 8, 9, 12, 13, 11, 10, 5, 6, 7, 2, 3, 4});
    }

    @Test
    void TestCarClass() {
        Car b1 = new Car("Private", "Toyota", "red");
        Car b2 = new Car("Private", "Toyota", "blue");
        Car b3 = new Car("Private", "Mazda", "green");
        Car b4 = new Car("Truck", "Volvo", "silver");
        Car b5 = new Car("Truck", "Skoda", "yellow");
        Car b6 = new Car("Private", "Audi", "brown");
        Car b7 = new Car("Private", "Audi", "gray");
        assertTrue(b1.isSameCar(b2));
        assertFalse(b2.isSameCar(b3));
        assertFalse(b3.isSameCar(b4));
        assertFalse(b4.isSameCar(b5));
        assertFalse(b5.isSameCar(b6));
        assertTrue(b6.isSameCar(b7));
    }

}