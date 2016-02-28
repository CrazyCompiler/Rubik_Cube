
public class Position {
    private int x;
    private int y;
    private Block blk;

    public Position(int x, int y, Block blk) {
        this.x = x;
        this.y = y;
        this.blk = blk;
    }

    public Block getBlock() {
        return this.blk;
    }

    public void alterBlock(Block blk) {
        this.blk = blk;
    }

    public String toString() {
        return this.blk.toString() + "@" + this.x + "," + this.y;
    }
}
