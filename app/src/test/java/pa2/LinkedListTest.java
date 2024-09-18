package pa2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    void testAdd() {
        LinkedList list = new LinkedList();
        list.add(5);
        assertEquals("5", list.traverse());

        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        assertEquals("1 2 3 4 5", list.traverse());

        list.add(2);
        assertEquals("1 2 2 3 4 5", list.traverse());
    }

    @Test
    void testRemove() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);
        assertEquals("2 3", list.traverse());

        list.remove(3);
        assertEquals("2", list.traverse());

        list.remove(2);
        assertEquals("", list.traverse());

        list.remove(4);
        assertEquals("", list.traverse());
    }

    @Test
    void testTraverseAndReverse() {
        LinkedList list = new LinkedList();
        assertEquals("", list.traverse());
        assertEquals("", list.reverse());

        list.add(1);
        assertEquals("1", list.traverse());
        assertEquals("1", list.reverse());

        list.add(2);
        list.add(3);
        assertEquals("1 2 3", list.traverse());
        assertEquals("3 2 1", list.reverse());
    }

    @Test
    void testMerge() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList merged = LinkedList.merge(list1, list2);
        assertEquals("", merged.traverse());

        list1.add(1);
        list1.add(3);
        list1.add(5);
        merged = LinkedList.merge(list1, list2);
        assertEquals("1 3 5", merged.traverse());

        list2.add(2);
        list2.add(4);
        list2.add(6);
        merged = LinkedList.merge(list1, list2);
        assertEquals("1 2 3 4 5 6", merged.traverse());
    }

}
