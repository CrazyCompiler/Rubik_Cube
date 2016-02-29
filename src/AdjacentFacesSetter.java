import java.util.HashMap;

/**
 * Created by virajpa on 29/02/16.
 */
public class AdjacentFacesSetter {
    private HashMap<String, Face> allFaces;


    public AdjacentFacesSetter(HashMap<String, Face> allFaces){
        this.allFaces = allFaces;
    }

    public void setAdjacentFaces(){
        Face firstFace = this.allFaces.get("firstFace");
        Face secondFace = this.allFaces.get("secondFace");
        Face thirdFace = this.allFaces.get("thirdFace");
        Face fourthFace = this.allFaces.get("fourthFace");
        Face fifthFace = this.allFaces.get("fifthFace");
        Face sixthFace = this.allFaces.get("sixthFace");

        firstFace.addAdjacentFaces(thirdFace,fifthFace,secondFace,fourthFace);
        secondFace.addAdjacentFaces(thirdFace,fifthFace,sixthFace,firstFace);
        thirdFace.addAdjacentFaces(sixthFace,firstFace,secondFace,fourthFace);
        fourthFace.addAdjacentFaces(thirdFace,fifthFace,firstFace,sixthFace);
        fifthFace.addAdjacentFaces(firstFace,sixthFace,secondFace,fourthFace);
        sixthFace.addAdjacentFaces(fifthFace,thirdFace,secondFace,fourthFace);
    }
}
