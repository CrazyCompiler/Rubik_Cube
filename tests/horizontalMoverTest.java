import org.junit.Test;

import java.util.HashMap;

/**
 * Created by virajpa on 28/02/16.
 */
public class HorizontalMoverTest {
    @Test
    public void test_move_which_moves_sections_clockwise(){
        HashMap<String, Face> allFaces = new HashMap<String, Face>();
        allFaces.put("firstFace", new Face("red"));
        allFaces.put("secondFace", new Face("green"));
        allFaces.put("thirdFace", new Face("yellow"));
        allFaces.put("fourthFace", new Face("blue"));
        allFaces.put("fifthFace", new Face("white"));
        allFaces.put("sixthFace", new Face("orange"));
        HorizontalMover horizontalMover = new HorizontalMover(allFaces);
        horizontalMover.clockWiseMovement("firstFace","horizontalTop");

    }

    @Test
    public void test_move_which_moves_sections_antiClockwise(){


    }
}