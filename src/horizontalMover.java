import java.util.HashMap;

/**
 * Created by virajpa on 28/02/16.
 */
public class HorizontalMover implements movers{
    private HashMap<String, Face> allFaces;
    public HorizontalMover(HashMap<String, Face> allFaces){
        this.allFaces = allFaces;
    }

    public void clockWiseMovement(String faceName, String sectionName){
        Face currentFace = this.allFaces.get(faceName);

    }
    public void antiClockWiseMovement(String faceName,String sectionName){

    }
}
