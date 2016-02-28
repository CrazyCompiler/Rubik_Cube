
public class SectionOfThreeBlocks {
    private String sectionPosition;
    private Position firstBlock;
    private Position secondBlock;
    private Position thirdBlock;

    public SectionOfThreeBlocks(String position, Position firstBlock, Position secondBlock, Position thirdBlock) {
        this.sectionPosition = position;
        this.firstBlock = firstBlock;
        this.secondBlock = secondBlock;
        this.thirdBlock = thirdBlock;
    }

    public boolean isPosition(String position) {
        return position == this.sectionPosition;
    }

    public Block[] getBlocks() {
        Block[] blk = {this.firstBlock.getBlock(), this.secondBlock.getBlock(), this.thirdBlock.getBlock()};
        return blk;
    }

    public void alterBlocks(SectionOfThreeBlocks anotherSection) {
        Block[] blk = anotherSection.getBlocks();
        this.firstBlock.alterBlock(blk[0]);
        this.secondBlock.alterBlock(blk[1]);
        this.thirdBlock.alterBlock(blk[2]);
    }

    public boolean hasBlocks(Block firstBlock, Block secondBlock, Block thirdBlock) {
        return (this.firstBlock.getBlock() == firstBlock && this.secondBlock.getBlock() == secondBlock && this.thirdBlock.getBlock() == thirdBlock);
    }

    public String getPosition(){
        return this.sectionPosition;
    }

    public String toString(){
        return this.firstBlock.getBlock().toString()+","
                +this.secondBlock.getBlock().toString()+","+
                this.thirdBlock.getBlock()+"@"+this.sectionPosition;
    }

}
