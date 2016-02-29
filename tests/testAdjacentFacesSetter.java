import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;


/**
 * Created by virajpa on 29/02/16.
 */
public class testAdjacentFacesSetter {
    @Test
    public void testSetAdjacentFaces_which_sets_adjacent_faces_for_all_faces_in_given_new_cube() throws Exception {
        HashMap<String, Face> allFaces = new HashMap<String, Face>();

        Face firstFace = new Face("red", "firstFace");
        Face secondFace = new Face("green", "secondFace");
        Face thirdFace = new Face("yellow", "thirdFace");
        Face fourthFace = new Face("blue", "fourthFace");
        Face fifthFace = new Face("white", "fifthFace");
        Face sixthFace = new Face("orange", "sixthFace");

        allFaces.put("firstFace", firstFace);
        allFaces.put("secondFace", secondFace);
        allFaces.put("thirdFace", thirdFace);
        allFaces.put("fourthFace", fourthFace);
        allFaces.put("fifthFace", fifthFace);
        allFaces.put("sixthFace", sixthFace);
        AdjacentFacesSetter setter = new AdjacentFacesSetter(allFaces);
        setter.setAdjacentFaces();

        HashMap<String, Face> expectedFirstFaceAdjacentFaces = new HashMap<String, Face>();
        expectedFirstFaceAdjacentFaces.put("horizontalNext", fifthFace);
        expectedFirstFaceAdjacentFaces.put("horizontalPrevious", thirdFace);
        expectedFirstFaceAdjacentFaces.put("verticalNext", fourthFace);
        expectedFirstFaceAdjacentFaces.put("verticalPrevious", secondFace);

        assertEquals(expectedFirstFaceAdjacentFaces,firstFace.getAdjacentFaces());

        HashMap<String, Face> expectedSecondFaceAdjacentFaces = new HashMap<String, Face>();
        expectedSecondFaceAdjacentFaces.put("horizontalPrevious", thirdFace);
        expectedSecondFaceAdjacentFaces.put("horizontalNext", fifthFace);
        expectedSecondFaceAdjacentFaces.put("verticalPrevious", sixthFace);
        expectedSecondFaceAdjacentFaces.put("verticalNext", firstFace);

        assertEquals(expectedSecondFaceAdjacentFaces,secondFace.getAdjacentFaces());

        HashMap<String, Face> expectedThirdFaceAdjacentFaces = new HashMap<String, Face>();
        expectedThirdFaceAdjacentFaces.put("horizontalPrevious", sixthFace);
        expectedThirdFaceAdjacentFaces.put("horizontalNext", firstFace);
        expectedThirdFaceAdjacentFaces.put("verticalPrevious", secondFace);
        expectedThirdFaceAdjacentFaces.put("verticalNext", fourthFace);

        assertEquals(expectedThirdFaceAdjacentFaces,thirdFace.getAdjacentFaces());

        HashMap<String, Face> expectedFourthFaceAdjacentFaces = new HashMap<String, Face>();
        expectedFourthFaceAdjacentFaces.put("horizontalPrevious", thirdFace);
        expectedFourthFaceAdjacentFaces.put("horizontalNext", fifthFace);
        expectedFourthFaceAdjacentFaces.put("verticalPrevious", firstFace);
        expectedFourthFaceAdjacentFaces.put("verticalNext", sixthFace);

        assertEquals(expectedFourthFaceAdjacentFaces,fourthFace.getAdjacentFaces());

        HashMap<String, Face> expectedFifthFaceAdjacentFaces = new HashMap<String, Face>();
        expectedFifthFaceAdjacentFaces.put("horizontalPrevious", firstFace);
        expectedFifthFaceAdjacentFaces.put("horizontalNext", sixthFace);
        expectedFifthFaceAdjacentFaces.put("verticalPrevious", secondFace);
        expectedFifthFaceAdjacentFaces.put("verticalNext", fourthFace);

        assertEquals(expectedFifthFaceAdjacentFaces,fifthFace.getAdjacentFaces());

        HashMap<String, Face> expectedSixthFaceAdjacentFaces = new HashMap<String, Face>();
        expectedSixthFaceAdjacentFaces.put("horizontalPrevious", fifthFace);
        expectedSixthFaceAdjacentFaces.put("horizontalNext", thirdFace);
        expectedSixthFaceAdjacentFaces.put("verticalPrevious", secondFace);
        expectedSixthFaceAdjacentFaces.put("verticalNext", fourthFace);

        assertEquals(expectedSixthFaceAdjacentFaces,sixthFace.getAdjacentFaces());

    }
}
