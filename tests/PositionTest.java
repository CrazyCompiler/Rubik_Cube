import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by virajpa on 26/02/16.
 */
public class PositionTest {
    @Test
    public void test_getBlock() {
        String color = "red";
        Block blk = new Block(color);
        Position p = new Position(0, 1, blk);
        assertEquals(blk, p.getBlock());
    }

    @Test
    public void test_alterBlock_which_chages_the_block_element() {
        String color = "red";
        Block blk = new Block(color);
        Position p = new Position(0, 1, blk);
        String color2 = "blue";
        Block blk2 = new Block(color2);
        p.alterBlock(blk2);
        assertEquals(blk2, p.getBlock());
    }

    @Test
    public void test_toString_which_proides_color_and_x_y_axis() {
        String color = "red";
        Block blk = new Block(color);
        Position p = new Position(0, 1, blk);
        String stringifyForm = "red@0,1";
        assertEquals(stringifyForm, p.toString());
    }
}