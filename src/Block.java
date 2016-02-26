/**
 * Created by virajpa on 25/02/16.
 * Block is smallest component of the Rubic cubes. It has color and it knows its position according to the x and y axis.
 * Its color and position never changes.
 */
public class Block {
    private String color;

    public Block(String color) {
        this.color = color;
    }

    public String toString() {
        return this.color;
    }

}
