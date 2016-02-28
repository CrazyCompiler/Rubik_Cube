import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSectionOfThreeBlocks {
    @Test
    public void test_sectionOfThreeBlocks_to_string() {
        Block blk = new Block("red");
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);

        SectionOfThreeBlocks sec = new SectionOfThreeBlocks("top", p1, p2, p3);
        assertTrue(sec.isPosition("top"));
    }

    @Test
    public void test_getBlocks() {
        Block blk = new Block("red");
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);
        SectionOfThreeBlocks sec = new SectionOfThreeBlocks("top", p1, p2, p3);
        Block[] blocks = {blk, blk, blk};
        assertArrayEquals("Both arrays are not equal", blocks, sec.getBlocks());
    }

    @Test
    public void test_alterBlocks() {
        Block blk = new Block("red");
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);
        SectionOfThreeBlocks sec = new SectionOfThreeBlocks("top", p1, p2, p3);

        Block blk2 = new Block("blue");
        Position p4 = new Position(0, 0, blk2);
        Position p5 = new Position(0, 1, blk2);
        Position p6 = new Position(0, 2, blk2);
        SectionOfThreeBlocks sec2 = new SectionOfThreeBlocks("top", p4, p5, p6);
        sec.alterBlocks(sec2);
        assertTrue(sec.hasBlocks(blk2, blk2, blk2));
        assertTrue(sec.isPosition("top"));
        assertEquals(p1.getBlock().toString(), blk2.toString());
    }

    @Test
    public void test_toString_which_provides_position_of_section() {
        Block blk = new Block("red");
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);
        SectionOfThreeBlocks sec = new SectionOfThreeBlocks("top", p1, p2, p3);
        assertEquals("red,red,red@top", sec.toString());
    }

    @Test
    public void test_getPosition_provides_position_of_section() throws Exception {
        Block blk = new Block("red");
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);
        SectionOfThreeBlocks sec = new SectionOfThreeBlocks("top", p1, p2, p3);
        assertEquals("top", sec.getPosition());
    }
}
