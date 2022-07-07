package hwr.oop;

import java.util.Arrays;
import java.util.Random;

public class Rules {

    private final String[] tetrisBlocksNames = new String[] {"L","J","I","O","T","Z","S"};
    private int[][] area = new int[20][10];//Zuerst Höhe, dann Breite
    private Shape fallingShape;

    Rules(){
        Arrays.stream(area).forEach(a -> Arrays.fill(a, 0));
    }

    public Shape spawnShape(){
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(6);
        return new Shape(tetrisBlocksNames[randomNumber],19,4 ,this);
    }

    //This Method should repeat as fast as the game works, like once a second
    public void Tick(){
        moveShapeDown();
        clearRowWithOnes();
    }

    public void moveShapeDown(){
        //this should happen one time at the start of the game
        if(fallingShape == null){
            fallingShape = spawnShape();
        }
        setShapeToZero();
        if(fallingShape.moveDown()){
            setShapeToOne();
        }else{
            setShapeToOne();
            fallingShape = spawnShape();
        }
    }

    public void setShapeToOne(){
        int[][] spots = fallingShape.getBlocks();
        for(int i = 0; i < spots.length; i++){
            setBlockToOne(spots[i][0],spots[i][1]);
        }
    }

    public void setShapeToZero(){
        int[][] spots = fallingShape.getBlocks();
        for(int i = 0; i < spots.length; i++){
            setBlockToZero(spots[i][0],spots[i][1]);
        }
    }

    public boolean setBlockToOne(int y, int x){
        if(area[y][x] == 1){
            return false;
        }else{
            area[y][x] = 1;
            return true;
        }
    }

    public boolean setBlockToZero(int y, int x){
        if(area[y][x] == 0){
            return false;
        }else{
            area[y][x] = 0;
            return true;
        }
    }

    public boolean clearRowWithOnes(){
        for(int i = 0;i <= area.length - 1; i++){
            if(Arrays.equals(area[i], new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1})){
                for(int j = i;j <= area.length - 1; j++) {
                    if (j == area.length - 1){
                        area[j] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    }else{
                        area[j] = area[j + 1];
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Shape getFallingShape(){
        return fallingShape;
    }

    public int[][] getField(){
        return area;
    }
}
