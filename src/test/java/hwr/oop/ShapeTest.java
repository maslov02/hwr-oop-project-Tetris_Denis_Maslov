package hwr.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private int[] block1 = new int[2];
    private int[] block2 = new int[2];
    private int[] block3 = new int[2];
    private int[] block4 = new int[2];

    private final String[] tetrisBlocksNames = new String[] {"L","J","I","O","T","Z","S"};
    private final String[] tetrisBlockThatStartLeftUpper = new String[] {"L","I","O","Z"};
    private final String[] TetrisBlockThatStartRightUpper = new String[] {"J","S"};
    private final String tetrisBlockThatStartMiddleUpper = "T";

    //----Test if Blocks are correct created----------------------
    @Test
    public void testShapeL(){
        Shape L = new Shape("L",3,1);
        block1 = new int[]{3,1};
        block2 = new int[]{block1[0]-1 , block1[1]};
        block3 = new int[]{block1[0]-2 , block1[1]};
        block4 = new int[]{block1[0]-2 , block1[1]+1};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = L.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeJ(){
        Shape J = new Shape("J",3,2);
        block1 = new int[]{3,2};
        block2 = new int[]{block1[0]-1 , block1[1]};
        block3 = new int[]{block1[0]-2 , block1[1]};
        block4 = new int[]{block1[0]-2 , block1[1]-1};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = J.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeI(){
        Shape I = new Shape("I",4,1);
        block1 = new int[]{4,1};
        block2 = new int[]{block1[0]-1 , block1[1]};
        block3 = new int[]{block1[0]-2 , block1[1]};
        block4 = new int[]{block1[0]-3 , block1[1]};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = I.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeO(){
        Shape O = new Shape("O",2,1);
        block1 = new int[]{2,1};
        block2 = new int[]{block1[0]-1 , block1[1]};
        block3 = new int[]{block1[0] , block1[1]+1};
        block4 = new int[]{block1[0]-1 , block1[1]+1};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = O.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeT(){
        Shape T = new Shape("T",2,2);
        block1 = new int[]{2,2};
        block2 = new int[]{block1[0]-1 , block1[1]+1};
        block3 = new int[]{block1[0]-1 , block1[1]};
        block4 = new int[]{block1[0]-1 , block1[1]-1};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = T.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeZ(){
        Shape Z = new Shape("Z",2,1);
        block1 = new int[]{2,1};
        block2 = new int[]{block1[0] , block1[1]+1};
        block3 = new int[]{block1[0]-1 , block1[1]+1};
        block4 = new int[]{block1[0]-1 , block1[1]+2};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = Z.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeS(){
        Shape S = new Shape("S",2,3);
        block1 = new int[]{2,3};
        block2 = new int[]{block1[0] , block1[1]-1};
        block3 = new int[]{block1[0]-1 , block1[1]-1};
        block4 = new int[]{block1[0]-1 , block1[1]-2};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = S.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    //----These are testing the collision with the border-----------

        //-------------Right Side---------------

    @Test
    public void testShapeLMoveToRight(){
        Shape shape = new Shape("L",3,8);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeJMoveToRight(){
        Shape shape = new Shape("J",3,9);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeIMoveToRight(){
        Shape shape = new Shape("I",4,9);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeOMoveToRight(){
        Shape shape = new Shape("O",2,8);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeTMoveToRight(){
        Shape shape = new Shape("T",2,8);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeZMoveToRight(){
        Shape shape = new Shape("Z",2,7);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeSMoveToRight(){
        Shape shape = new Shape("S",2,9);
        Assertions.assertFalse(shape.moveToRight());
    }

        //-------------Left Side----------

    @Test
    public void testShapeLMoveToLeft(){
        Shape shape = new Shape("L",3,0);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeJMoveToLeft(){
        Shape shape = new Shape("J",3,1);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeIMoveToLeft(){
        Shape shape = new Shape("I",4,0);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeOMoveToLeft(){
        Shape shape = new Shape("O",2,0);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeTMoveToLeft(){
        Shape shape = new Shape("T",2,1);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeZMoveToLeft(){
        Shape shape = new Shape("Z",2,0);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeSMoveToLeft(){
        Shape shape = new Shape("S",2,2);
        Assertions.assertFalse(shape.moveToLeft());
    }

        //--------Down Movement-----------

    @Test
    public void testShapeLMoveDown(){
        Shape shape = new Shape("L",2,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeJMoveDown(){
        Shape shape = new Shape("J",2,1);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeIMoveDown(){
        Shape shape = new Shape("I",3,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeOMoveDown(){
        Shape shape = new Shape("O",1,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeTMoveDown(){
        Shape shape = new Shape("T",1,1);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeZMoveDown(){
        Shape shape = new Shape("S",1,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeSMoveDown(){
        Shape shape = new Shape("S",1,2);
        Assertions.assertFalse(shape.moveDown());
    }

    //-------idk----------

}