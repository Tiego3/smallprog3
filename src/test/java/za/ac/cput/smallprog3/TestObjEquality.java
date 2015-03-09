package za.ac.cput.smallprog3;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestObjEquality extends TestCase {
    String ob = new String("one");
    String obe = new String("one");

    @Test
    public void testEquality() throws Exception {
        assertEquals(ob, obe);
    }
}