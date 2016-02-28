import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class testBlock {
    @Test
    public void test_toString() {
        String color = "red";
        Block blk = new Block(color);
        assertEquals("red", blk.toString());
    }
}
