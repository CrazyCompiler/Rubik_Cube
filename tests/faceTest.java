import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class faceTest {

    @Test
    public void test_alterSection_which_alter_top_section(){
        Block blk = new Block("green");
        Position p1 = new Position(0,0,blk);
        Position p2 = new Position(0,1,blk);
        Position p3 = new Position(0,2,blk);

        Block blk2 = new Block("red");
        Position p4 = new Position(1,0,blk2);
        Position p5 = new Position(1,1,blk2);
        Position p6 = new Position(1,2,blk2);
        Position p7 = new Position(2,0,blk2);
        Position p8 = new Position(2,1,blk2);
        Position p9 = new Position(2,2,blk2);

        SectionOfThreeBlocks horizontalTop = new SectionOfThreeBlocks("horizontalTop",p1,p2,p3);
        Face fontFace = new Face("red");
        fontFace.alterSection(horizontalTop);

        SectionOfThreeBlocks horizontalMiddle = new SectionOfThreeBlocks("horizontalMiddle",p4,p5,p6);
        SectionOfThreeBlocks horizontalBottom = new SectionOfThreeBlocks("horizontalBottom",p7,p8,p9);
        SectionOfThreeBlocks verticalLeft = new SectionOfThreeBlocks("verticalLeft",p1,p4,p7);
        SectionOfThreeBlocks verticalCenter = new SectionOfThreeBlocks("verticalCenter", p2, p5, p8);
        SectionOfThreeBlocks verticalRight = new SectionOfThreeBlocks("verticalRight", p3, p6, p9);

        assertTrue(fontFace.hasSectionAtPosition(horizontalMiddle,"horizontalMiddle"));
        assertTrue(fontFace.hasSectionAtPosition(horizontalBottom,"horizontalBottom"));
        assertTrue(fontFace.hasSectionAtPosition(verticalLeft,"verticalLeft"));
        assertTrue(fontFace.hasSectionAtPosition(verticalCenter,"verticalCenter"));
        assertTrue(fontFace.hasSectionAtPosition(verticalRight,"verticalRight"));
    }

    @Test
    public void test_alterSection_which_alter_left_section(){
        Block blk = new Block("green");
        Position p1 = new Position(0,0,blk);
        Position p4 = new Position(1,0,blk);
        Position p7 = new Position(2,0,blk);

        Block blk2 = new Block("red");
        Position p2 = new Position(0,1,blk2);
        Position p3 = new Position(0,2,blk2);
        Position p5 = new Position(1,1,blk2);
        Position p6 = new Position(1,2,blk2);
        Position p8 = new Position(2,1,blk2);
        Position p9 = new Position(2,2,blk2);

        SectionOfThreeBlocks verticalLeft = new SectionOfThreeBlocks("verticalLeft",p1,p4,p7);
        Face fontFace = new Face("red");
        fontFace.alterSection(verticalLeft);

        SectionOfThreeBlocks horizontalTop = new SectionOfThreeBlocks("horizontalTop",p1,p2,p3);
        SectionOfThreeBlocks horizontalMiddle = new SectionOfThreeBlocks("horizontalMiddle",p4,p5,p6);
        SectionOfThreeBlocks horizontalBottom = new SectionOfThreeBlocks("horizontalBottom",p7,p8,p9);
        SectionOfThreeBlocks verticalCenter = new SectionOfThreeBlocks("verticalCenter", p2, p5, p8);
        SectionOfThreeBlocks verticalRight = new SectionOfThreeBlocks("verticalRight", p3, p6, p9);

        assertTrue(fontFace.hasSectionAtPosition(horizontalTop,"horizontalTop"));
        assertTrue(fontFace.hasSectionAtPosition(horizontalMiddle,"horizontalMiddle"));
        assertTrue(fontFace.hasSectionAtPosition(horizontalBottom,"horizontalBottom"));
        assertTrue(fontFace.hasSectionAtPosition(verticalLeft,"verticalLeft"));
        assertTrue(fontFace.hasSectionAtPosition(verticalCenter,"verticalCenter"));
        assertTrue(fontFace.hasSectionAtPosition(verticalRight,"verticalRight"));
    }


}