import java.util.HashMap;

/**
 * Created by virajpa on 27/02/16.
 */
public class Cube {
    private HashMap<String, Face> allFaces = new HashMap<String, Face>();

    public Cube(){
        this.allFaces.put("firstFace",new Face("red","font"));
        this.allFaces.put("secondFace",new Face("green","left"));
        this.allFaces.put("thirdFace",new Face("yellow","right"));
        this.allFaces.put("fourthFace",new Face("blue","top"));
        this.allFaces.put("fifthFace",new Face("white","bottom"));
        this.allFaces.put("sixthFace",new Face("orange","back"));
    }

    public void alter(String facename,String sectionName,String momentName){
    }
}
