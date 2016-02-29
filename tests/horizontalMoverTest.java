import org.junit.Test;

import java.util.HashMap;

/**
 * Created by virajpa on 28/02/16.
 */
public class HorizontalMoverTest {
    @Test
    public void test_move_which_moves_sections_clockwise(){
        HashMap<String, Face> allFaces = new HashMap<String, Face>();
        allFaces.put("firstFace", new Face("red","font"));
        allFaces.put("secondFace", new Face("green","right"));
        allFaces.put("thirdFace", new Face("yellow","left"));
        allFaces.put("fourthFace", new Face("blue","back"));
        allFaces.put("fifthFace", new Face("white","top"));
        allFaces.put("sixthFace", new Face("orange","bottom"));
        AdjacentFacesSetter setter = new AdjacentFacesSetter(allFaces);
        setter.setAdjacentFaces();
        HorizontalMover horizontalMover = new HorizontalMover(allFaces);
        horizontalMover.clockWiseMovement("firstFace","horizontalTop");


    }

    @Test
    public void test_move_which_moves_sections_antiClockwise(){


    }
}