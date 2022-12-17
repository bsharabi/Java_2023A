package quizzical;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static quizzical.quizzical_A.*;


class quizzical_ATest {

    @Test
    void TestDefangIPaddr() {
        String ans;

        ans = defangIPaddr("1.1.1.1");
        assertEquals(ans, "1[.]1[.]1[.]1");
        ans = defangIPaddr("192.168.0.1");
        assertEquals(ans, "192[.]168[.]0[.]1");
        ans = defangIPaddr("10.0.0.1");
        assertEquals(ans, "10[.]0[.]0[.]1");
        ans = defangIPaddr("255.255.255.0");
        assertEquals(ans, "255[.]255[.]255[.]0");
    }

    @Test
    void TestFinalValueAfterOperations() {
        int ans;
        ans = finalValueAfterOperations(new String[]{"X++", "X++", "++X", "--X"});
        assertEquals(ans, 2);
        ans = finalValueAfterOperations(new String[]{"X++", "X--", "++X", "--X"});
        assertEquals(ans, 0);
        ans = finalValueAfterOperations(new String[]{"X++", "X++", "++X", "X++", "X++", "X++", "X++", "X--"});
        assertEquals(ans, 6);
        ans = finalValueAfterOperations(new String[]{"X--", "X--", "++X", "--X"});
        assertEquals(ans, -2);
    }

    @Test
    void TestNumIdenticalPairs() {
        int ans;
        ans = numIdenticalPairs(new int[]{1, 2, 4, 3, 1, 2, 3});
        assertEquals(ans, 3);
        ans = numIdenticalPairs(new int[]{1, 1, 1, 3, 2, 2, 3});
        assertEquals(ans, 5);
        ans = numIdenticalPairs(new int[]{1, 1, 4, 4, 4, 4, 3, 1, 2, 3});
        assertEquals(ans, 10);
        ans = numIdenticalPairs(new int[]{});
        assertEquals(ans, 0);

    }

    @Test
    void TestMaximumWealth() {
        int ans;
        ans = maximumWealth(new int[][]{{1, 2, 3, 4, 5}, {1, 4, 3, 2, 5}, {12, 34, 23, 12, 34}});
        assertEquals(ans, 115);
        ans = maximumWealth(new int[][]{{200, 1, 2, 3, 4, 5}, {1, 4, 3, 2, 5}, {12, 34, 23, 12, 34}});
        assertEquals(ans, 215);
        ans = maximumWealth(new int[][]{{1, 2, 3, 4, 5}, {1, 300, 4, 3, 2, 5}, {12, 34, 23, 12, 34}});
        assertEquals(ans, 315);
        ans = maximumWealth(new int[][]{{1, 2, 3, 4, 5}, {1, 4, 3, 2, 5}, {5, 4, 3, 2, 1}});
        assertEquals(ans, 15);
    }

    @Test
    void TestBookClass() {
        Book b1 = new Book("Alice", "Bob", 1456);
        Book b2 = new Book("Alice", "Bob", 765);
        Book b3 = new Book("Alice", "Bob1", 765);
        Book b4 = new Book("Alice", "bob", 765);
        Book b5 = new Book("Alice", "cob", 765);
        Book b6 = new Book("Alice", "Arik", 765);
        Book b7 = new Book("Alice", "Arik", 765);
        assertTrue(b1.isSameBook(b2));
        assertFalse(b2.isSameBook(b3));
        assertFalse(b3.isSameBook(b4));
        assertFalse(b4.isSameBook(b5));
        assertFalse(b5.isSameBook(b6));
        assertTrue(b6.isSameBook(b7));
    }
}