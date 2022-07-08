package hwr.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private int[] block1 = new int[2];
    private int[] block2 = new int[2];
    private int[] block3 = new int[2];
    private int[] block4 = new int[2];

    private final Rules actualRules = new Rules();

    //----Test if Blocks are correct created----------------------

    @Test
    public void testShapeL(){
        Shape L = new Shape("L",3,1,actualRules);
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
        Shape J = new Shape("J",3,2,actualRules);
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
        Shape I = new Shape("I",4,1,actualRules);
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
        Shape O = new Shape("O",2,1,actualRules);
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
        Shape T = new Shape("T",2,2,actualRules);
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
        Shape Z = new Shape("Z",2,1,actualRules);
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
        Shape S = new Shape("S",2,3,actualRules);
        block1 = new int[]{2,3};
        block2 = new int[]{block1[0] , block1[1]-1};
        block3 = new int[]{block1[0]-1 , block1[1]-1};
        block4 = new int[]{block1[0]-1 , block1[1]-2};

        int[][] testblocks = new int[][]{block1,block2,block3,block4};
        int[][] blocks = S.getBlocks();
        Assertions.assertArrayEquals(testblocks,blocks);
    }

    @Test
    public void testShapeToFail(){
        try{
            Shape shape = new Shape("ein nicht erwartetes Symbol", 5,5,actualRules);
        }catch (RuntimeException e){
            Assertions.assertNotNull(e);
        }


    }

    //----These are testing the collision with the border-----------

        //-------------Right Side---------------

    @Test
    public void testShapeLMoveToRight(){
        Shape shape = new Shape("L",3,8,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeJMoveToRight(){
        Shape shape = new Shape("J",3,9,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeIMoveToRight(){
        Shape shape = new Shape("I",4,9,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeOMoveToRight(){
        Shape shape = new Shape("O",2,8,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeTMoveToRight(){
        Shape shape = new Shape("T",2,8,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeZMoveToRight(){
        Shape shape = new Shape("Z",2,7,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testShapeSMoveToRight(){
        Shape shape = new Shape("S",2,9,actualRules);
        Assertions.assertFalse(shape.moveToRight());
    }

        //-------------Left Side----------

    @Test
    public void testShapeLMoveToLeft(){
        Shape shape = new Shape("L",3,0,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeJMoveToLeft(){
        Shape shape = new Shape("J",3,1,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeIMoveToLeft(){
        Shape shape = new Shape("I",4,0,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeOMoveToLeft(){
        Shape shape = new Shape("O",2,0,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeTMoveToLeft(){
        Shape shape = new Shape("T",2,1,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeZMoveToLeft(){
        Shape shape = new Shape("Z",2,0,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testShapeSMoveToLeft(){
        Shape shape = new Shape("S",2,2,actualRules);
        Assertions.assertFalse(shape.moveToLeft());
    }

        //--------Down Movement-----------

    @Test
    public void testShapeLMoveDown(){
        Shape shape = new Shape("L",2,0,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeJMoveDown(){
        Shape shape = new Shape("J",2,1,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeIMoveDown(){
        Shape shape = new Shape("I",3,0,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeOMoveDown(){
        Shape shape = new Shape("O",1,0,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeTMoveDown(){
        Shape shape = new Shape("T",1,1,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeZMoveDown(){
        Shape shape = new Shape("S",1,0,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testShapeSMoveDown(){
        Shape shape = new Shape("S",1,2,actualRules);
        Assertions.assertFalse(shape.moveDown());
    }

    //-------Test collision with other blocks, Downwords----------

    @Test
    public void testIfCollisionWorksCorrectDownL(){
        Shape shape = new Shape("L",4,0,actualRules);
        actualRules.setBlockToOne(1,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownJ(){
        Shape shape = new Shape("J",4,1,actualRules);
        actualRules.setBlockToOne(1,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownI(){
        Shape shape = new Shape("I",4,0,actualRules);
        actualRules.setBlockToOne(0,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownO(){
        Shape shape = new Shape("O",2,0,actualRules);
        actualRules.setBlockToOne(0,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownT(){
        Shape shape = new Shape("T",2,1,actualRules);
        actualRules.setBlockToOne(0,0);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownZ(){
        Shape shape = new Shape("Z",2,0,actualRules);
        actualRules.setBlockToOne(0,1);
        Assertions.assertFalse(shape.moveDown());
    }

    @Test
    public void testIfCollisionWorksCorrectDownS(){
        Shape shape = new Shape("S",4,2,actualRules);
        actualRules.setBlockToOne(2,0);
        Assertions.assertFalse(shape.moveDown());
    }

    //-------Test collision with other blocks, Rightway----------

    @Test
    public void testIfCollisionWorksCorrectRightL(){
        Shape shape = new Shape("L",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightJ(){
        Shape shape = new Shape("J",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightI(){
        Shape shape = new Shape("I",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightO(){
        Shape shape = new Shape("O",4,3,actualRules);
        actualRules.setBlockToOne(4,5);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightT(){
        Shape shape = new Shape("T",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightZ(){
        Shape shape = new Shape("Z",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    @Test
    public void testIfCollisionWorksCorrectRightS(){
        Shape shape = new Shape("S",4,3,actualRules);
        actualRules.setBlockToOne(4,4);
        Assertions.assertFalse(shape.moveToRight());
    }

    //-------Test collision with other blocks, Leftway----------

    @Test
    public void testIfCollisionWorksCorrectLeftL(){
        Shape shape = new Shape("L",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftJ(){
        Shape shape = new Shape("J",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftI(){
        Shape shape = new Shape("I",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftO(){
        Shape shape = new Shape("O",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftT(){
        Shape shape = new Shape("T",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftZ(){
        Shape shape = new Shape("Z",4,4,actualRules);
        actualRules.setBlockToOne(4,3);
        Assertions.assertFalse(shape.moveToLeft());
    }

    @Test
    public void testIfCollisionWorksCorrectLeftS(){
        Shape shape = new Shape("S",4,4,actualRules);
        actualRules.setBlockToOne(4,2);
        Assertions.assertFalse(shape.moveToLeft());
    }

    //------Test if Shapes are moveable, Rightway

    @Test
    public void testIfShapesMoveToRightL(){
        Shape shape = new Shape("L",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightJ(){
        Shape shape = new Shape("J",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightI(){
        Shape shape = new Shape("I",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightO(){
        Shape shape = new Shape("O",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightT(){
        Shape shape = new Shape("T",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightZ(){
        Shape shape = new Shape("Z",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    @Test
    public void testIfShapesMoveToRightS(){
        Shape shape = new Shape("S",5,5,actualRules);
        Assertions.assertTrue(shape.moveToRight());
    }

    //------Test if Shapes are moveable, Leftway

    @Test
    public void testIfShapesMoveToLeftL(){
        Shape shape = new Shape("L",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftJ(){
        Shape shape = new Shape("J",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftI(){
        Shape shape = new Shape("I",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftO(){
        Shape shape = new Shape("O",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftT(){
        Shape shape = new Shape("T",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftZ(){
        Shape shape = new Shape("Z",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    @Test
    public void testIfShapesMoveToLeftS(){
        Shape shape = new Shape("S",5,5,actualRules);
        Assertions.assertTrue(shape.moveToLeft());
    }

    //------Test if Shapes are moveable, Downway

    @Test
    public void testIfShapeGoesDownL(){
        Shape shape = new Shape("L",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownJ(){
        Shape shape = new Shape("J",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownI(){
        Shape shape = new Shape("I",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownO(){
        Shape shape = new Shape("O",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownT(){
        Shape shape = new Shape("T",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownZ(){
        Shape shape = new Shape("Z",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }

    @Test
    public void testIfShapeGoesDownS(){
        Shape shape = new Shape("S",5,5,actualRules);
        Assertions.assertTrue(shape.moveDown());
    }
}