package hwr.oop;

public class Shape {

    private int[] block1 = new int[2];
    private int[] block2 = new int[2];
    private int[] block3 = new int[2];
    private int[] block4 = new int[2];
    private int y;
    private int x;

    Shape(String args, int y, int x) {
        if (args.equals("L")) {
            //begin left upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0] - 1, block1[1]};
            block3 = new int[]{block1[0] - 2, block1[1]};
            block4 = new int[]{block1[0] - 2, block1[1] + 1};
        } else if (args.equals("J")) {
            //begin right upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0] - 1, block1[1]};
            block3 = new int[]{block1[0] - 2, block1[1]};
            block4 = new int[]{block1[0] - 2, block1[1] - 1};
        } else if (args.equals("I")) {
            //beginn left upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0] - 1, block1[1]};
            block3 = new int[]{block1[0] - 2, block1[1]};
            block4 = new int[]{block1[0] - 3, block1[1]};
        } else if (args.equals("O")) {
            //beginn left upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0] - 1, block1[1]};
            block3 = new int[]{block1[0], block1[1] + 1};
            block4 = new int[]{block1[0] - 1, block1[1] + 1};
        } else if (args.equals("T")) {
            //begin middle upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0] - 1, block1[1] + 1};
            block3 = new int[]{block1[0] - 1, block1[1]};
            block4 = new int[]{block1[0] - 1, block1[1] - 1};
        } else if (args.equals("Z")) {
            //beginn left upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0], block1[1] + 1};
            block3 = new int[]{block1[0] - 1, block1[1] + 1};
            block4 = new int[]{block1[0] - 1, block1[1] + 2};
        } else if (args.equals("S")) {
            //begin right upper
            block1 = new int[]{y, x};
            block2 = new int[]{block1[0], block1[1] - 1};
            block3 = new int[]{block1[0] - 1, block1[1] - 1};
            block4 = new int[]{block1[0] - 1, block1[1] - 2};
        }
    }

    public int[][] getBlocks() {
        int[][] blocks = new int[][]{block1, block2, block3, block4};
        return blocks;
    }

    //CHANGE BONDARY TO 10
    public boolean moveToRight() {
        //moving all blocks to right and check if they are out of boundary :D

        block1[1] = block1[1] + 1;
        block2[1] = block2[1] + 1;
        block3[1] = block3[1] + 1;
        block4[1] = block4[1] + 1;

        if (block1[1] == 10 || block2[1] == 10 || block3[1] == 10 || block4[1] == 10) {
            block1[1] = block1[1] - 1;
            block2[1] = block2[1] - 1;
            block3[1] = block3[1] - 1;
            block4[1] = block4[1] - 1;
            return false;
        } else {
            return true;
        }
    }

    public boolean moveToLeft() {
        //moving all blocks to right and check if they are out of boundary :D

        block1[1] = block1[1] - 1;
        block2[1] = block2[1] - 1;
        block3[1] = block3[1] - 1;
        block4[1] = block4[1] - 1;

        if (block1[1] == -1 || block2[1] == -1 || block3[1] == -1 || block4[1] == -1) {
            block1[1] = block1[1] + 1;
            block2[1] = block2[1] + 1;
            block3[1] = block3[1] + 1;
            block4[1] = block4[1] + 1;
            return false;
        } else {
            return true;
        }
    }

    public boolean moveDown() {
        //moving the Block one block down and check if it hits boundary
        block1[0] = block1[0] - 1;
        block2[0] = block2[0] - 1;
        block3[0] = block3[0] - 1;
        block4[0] = block4[0] - 1;

        if (block1[0] == -1 || block2[0] == -1 || block3[0] == -1 || block4[0] == -1) {
            block1[0] = block1[1] + 1;
            block2[0] = block2[1] + 1;
            block3[0] = block3[1] + 1;
            block4[0] = block4[1] + 1;
            return false;
        } else {
            return true;
        }
    }

}
