import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void testFindMin1() {
        int[] array = new int[] {1,2, 3, 5, 7};
        assertEquals(Finder.findMin(array), 1);
    }

    @Test
    void testFindMin2() {
        int[] array = new int[] {};
        assertNull(Finder.findMin(array));
    }

    @Test
    void testFindMin3() {
        int[] array = null;
        assertNull(Finder.findMin(array));
    }

    @Test
    void testFindMax1() {
        int[] array = new int[] { 1,2, 3, 5, 7};
        assertEquals(Finder.findMax(array), 7);
    }

    @Test
    void testFindMax2() {
        int[] array = new int[] {};
        assertNull(Finder.findMax(array));
    }

    @Test
    void testFindMax3() {
        int[] array = null;
        assertNull(Finder.findMax(array));
    }
}