import java.util.HashMap;

/**
 * Created by virajpa on 27/02/16.
 */
public class Cube {
    private HashMap<String, Face> allFaces = new HashMap<String, Face>();

    public Cube(){
        this.allFaces.put("firstFace",new Face("red"));
        this.allFaces.put("secondFace",new Face("green"));
        this.allFaces.put("thirdFace",new Face("yellow"));
        this.allFaces.put("fourthFace",new Face("blue"));
        this.allFaces.put("fifthFace",new Face("white"));
        this.allFaces.put("sixthFace",new Face("orange"));
    }

    public void alter(String facename,String sectionName,String momentName){
    }
}
