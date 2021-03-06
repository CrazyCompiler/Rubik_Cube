import java.util.HashMap;

public class Face {

    private String name;
    private HashMap<String, SectionOfThreeBlocks> allSection = new HashMap<String, SectionOfThreeBlocks>();
    private Face horizontalNext;
    private Face horizontalPrevious;
    private Face verticalNext;
    private Face verticalPrevious;

    public Face(String color, String name) {
        Block blk = new Block(color);
        Position p1 = new Position(0, 0, blk);
        Position p2 = new Position(0, 1, blk);
        Position p3 = new Position(0, 2, blk);
        Position p4 = new Position(1, 0, blk);
        Position p5 = new Position(1, 1, blk);
        Position p6 = new Position(1, 2, blk);
        Position p7 = new Position(2, 0, blk);
        Position p8 = new Position(2, 1, blk);
        Position p9 = new Position(2, 2, blk);
        this.allSection.put("horizontalTop", new SectionOfThreeBlocks("horizontalTop", p1, p2, p3));
        this.allSection.put("horizontalMiddle", new SectionOfThreeBlocks("horizontalMiddle", p4, p5, p6));
        this.allSection.put("horizontalBottom", new SectionOfThreeBlocks("horizontalBottom", p7, p8, p9));
        this.allSection.put("verticalLeft", new SectionOfThreeBlocks("verticalLeft", p1, p4, p7));
        this.allSection.put("verticalCenter", new SectionOfThreeBlocks("verticalCenter", p2, p5, p8));
        this.allSection.put("verticalRight", new SectionOfThreeBlocks("verticalRight", p3, p6, p9));
        this.name = name;
    }

    public void alterSection(SectionOfThreeBlocks givenSection) {
        SectionOfThreeBlocks sectionToAlter = this.allSection.get(givenSection.getPosition());
        sectionToAlter.alterBlocks(givenSection);
    }

    public boolean hasSectionAtPosition(SectionOfThreeBlocks givenSection, String sectionNameToCheck) {
        SectionOfThreeBlocks sectionToCheck = this.allSection.get(sectionNameToCheck);
        return (sectionToCheck.toString().equals(givenSection.toString()));
    }

    public SectionOfThreeBlocks getSection(String sectionName) {
        return this.allSection.get(sectionName);
    }

    public void addAdjacentFaces(Face horizontalPrevious, Face horizontalNext, Face verticalPrevious, Face verticalNext) {
        this.horizontalNext = horizontalNext;
        this.horizontalPrevious = horizontalPrevious;
        this.verticalNext = verticalNext;
        this.verticalPrevious = verticalPrevious;
    }

    public HashMap<String, Face> getAdjacentFaces() {
            HashMap<String, Face> adjacentFaces = new HashMap<String, Face>();
        adjacentFaces.put("horizontalNext", this.horizontalNext);
        adjacentFaces.put("horizontalPrevious", this.horizontalPrevious);
        adjacentFaces.put("verticalNext", this.verticalNext);
        adjacentFaces.put("verticalPrevious", this.verticalPrevious);
        return adjacentFaces;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

}
