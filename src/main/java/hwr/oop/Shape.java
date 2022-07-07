package hwr.oop;

public class Shape {

    private int[] block1;
    private int[] block2;
    private int[] block3;
    private int[] block4;
    private final Rules actualRules;

    Shape(String args, int y, int x,Rules rules) {
        actualRules = rules;
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
        }else{
            throw new RuntimeException("Ungültige Eingabe");
        }
    }

    public boolean moveToRight() {
        //moving the Blocks one block to Right and check if it hits boundary or other blocks
        block1[1] = block1[1] + 1;
        block2[1] = block2[1] + 1;
        block3[1] = block3[1] + 1;
        block4[1] = block4[1] + 1;
        int[][] area = actualRules.getField();
        //boundary and Block check
        if (block1[1] == 10 || block2[1] == 10 || block3[1] == 10 || block4[1] == 10
            || area[block1[0]][block1[1]] == 1
            || area[block2[0]][block2[1]] == 1
            || area[block3[0]][block3[1]] == 1
            || area[block4[0]][block4[1]] == 1) {
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
        //moving the Blocks one block to Left and check if it hits boundary or other blocks
        block1[1] = block1[1] - 1;
        block2[1] = block2[1] - 1;
        block3[1] = block3[1] - 1;
        block4[1] = block4[1] - 1;

        int[][] area = actualRules.getField();

        //boundary and Block check
        if (block1[1] == -1 || block2[1] == -1 || block3[1] == -1 || block4[1] == -1
            || area[block1[0]][block1[1]] == 1
            || area[block2[0]][block2[1]] == 1
            || area[block3[0]][block3[1]] == 1
            || area[block4[0]][block4[1]] == 1) {
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
        //moving the Blocks one block Down and check if it hits boundary or other blocks
        block1[0] = block1[0] - 1;
        block2[0] = block2[0] - 1;
        block3[0] = block3[0] - 1;
        block4[0] = block4[0] - 1;

        int[][] area = actualRules.getField();

        //boundary and Block check
        if (block1[0] == -1 || block2[0] == -1 || block3[0] == -1 || block4[0] == -1
            || area[block4[0]][block4[1]] == 1
            || area[block3[0]][block3[1]] == 1
            || area[block2[0]][block2[1]] == 1
            || area[block1[0]][block1[1]] == 1
            ) {
            block1[0] = block1[1] + 1;
            block2[0] = block2[1] + 1;
            block3[0] = block3[1] + 1;
            block4[0] = block4[1] + 1;
            return false;
        } else {
            return true;
        }
    }

    public int[][] getBlocks() {
        return new int[][]{block1, block2, block3, block4};
    }

}
