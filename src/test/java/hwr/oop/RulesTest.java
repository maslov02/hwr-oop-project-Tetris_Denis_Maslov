package hwr.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RulesTest {

    @Test
    public void createAreaTest(){
        int[][] areaMatrix = new int[20][10];
        Arrays.stream(areaMatrix).forEach(a -> Arrays.fill(a, 0));

        Rules rules = new Rules();
        int[][] fieldArea = rules.getField();

        Assertions.assertArrayEquals(fieldArea,areaMatrix);
    }

    @Test
    public void spawnShapeTest(){
        Rules rules = new Rules();
        String[] tetrisBlocksNames = new String[] {"L","J","I","O","T","Z","S"};

        for (int i = 0; i < tetrisBlocksNames.length; i++) {
            Shape shape = new Shape(tetrisBlocksNames[i],19,5 ,rules);
            if(Arrays.deepEquals(shape.getBlocks(), rules.spawnShape().getBlocks())){
                Assertions.assertArrayEquals(shape.getBlocks(),rules.spawnShape().getBlocks());
            }
        }
    }

    @Test
    public void setBlockToOneTest(){
        Rules rules = new Rules();
        Assertions.assertTrue(rules.setBlockToOne(1,1));
    }

    @Test
    public void setBlockToOneTest_zwoTimesOnSameSpot(){
        Rules rules = new Rules();
        rules.setBlockToOne(1,1);
        Assertions.assertFalse(rules.setBlockToOne(1,1));
    }

    @Test
    public void setBlockToZeroTest(){
        Rules rules = new Rules();
        //If Area is created is everything is Zero
        Assertions.assertFalse(rules.setBlockToZero(1,1));
    }

    @Test
    public void setBlockToOneAndThanZeroTest(){
        Rules rules = new Rules();
        rules.setBlockToOne(1,1);
        Assertions.assertTrue(rules.setBlockToZero(1,1));
    }

    @Test
    public void clearRow(){
        Rules rules = new Rules();
        for(int i = 0; i <= 9; i++) {
            rules.setBlockToOne(0,i);
        }
        Assertions.assertTrue(rules.clearRowWithOnes());
    }

    @Test
    public void clearRowTwoTimes(){
        Rules rules = new Rules();
        for(int i = 0; i <= 9; i++) {
            rules.setBlockToOne(0,i);
            rules.setBlockToOne(2,i);
        }
        Assertions.assertTrue(rules.clearRowWithOnes());
    }

    //This should return false because Gamefield has just 9 ones;and not 10 ones
    @Test
    public void testClearRowWithNineOnes(){
        Rules rules = new Rules();
        for(int i = 0; i <= 8; i++) {
            rules.setBlockToOne(0,i);
            rules.setBlockToOne(2,i);
        }
        Assertions.assertFalse(rules.clearRowWithOnes());
    }

    //The Test shows that blocks are dropping and the rules-class creates new Shapes by itself
    @Test
    public void moveShapeDownTest(){
        Rules rules = new Rules();
        //place a block so the shape will collide agaist the block and should stop
        rules.setBlockToOne(15,5);
        Shape firstShape = rules.getFallingShape();
        //Shapes spawn at y:19 and x:5
        rules.moveShapeDown();
        rules.moveShapeDown();
        rules.moveShapeDown();
        Shape secondShape = rules.getFallingShape();
        Assertions.assertNotEquals(firstShape,secondShape);
    }

    @Test
    public void tickTest(){
        Rules rules = new Rules();
        rules.setBlockToOne(15,5);
        Shape firstShape = rules.getFallingShape();
        rules.tick();
        rules.tick();
        rules.tick();
        Shape secondShape = rules.getFallingShape();
        Assertions.assertNotEquals(firstShape,secondShape);
    }

    @Test
    public void testifnewShapeisCreated(){
        Rules rules = new Rules();
        rules.tick();
        rules.tick();
        Shape firstShape = rules.getFallingShape();
        for (int i = 0; i < rules.getField().length; i++){
            rules.tick();
        }
        Assertions.assertNotEquals(firstShape,rules.getFallingShape());

    }

}