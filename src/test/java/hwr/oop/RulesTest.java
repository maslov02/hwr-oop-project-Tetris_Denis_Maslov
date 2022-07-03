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
            Shape shape = new Shape(tetrisBlocksNames[i],20,5 );
            if(shape.getBlocks().equals(rules.spawnShape().getBlocks())){
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
        Assertions.assertTrue(rules.clearOneRow());
    }

    @Test
    public void clearRowTwoTimes(){
        Rules rules = new Rules();
        for(int i = 0; i <= 9; i++) {
            rules.setBlockToOne(0,i);
            rules.setBlockToOne(2,i);
        }
        Assertions.assertTrue(rules.clearOneRow());
    }
}