package hwr.oop;

import java.util.Arrays;
import java.util.Random;

public class Rules {

    private String[] tetrisBlocksNames = new String[] {"L","J","I","O","T","Z","S"};
    private int[][] area = new int[20][10];//Zuerst Höhe, dann Breite
    private Shape fallingShape;

    Rules(){
        Arrays.stream(area).forEach(a -> Arrays.fill(a, 0));
    }

    public Shape spawnShape(){
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(6);
        Shape shape = new Shape(tetrisBlocksNames[randomNumber],20,5 );
        return shape;
    }

    public void Timer(){

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

    public boolean clearOneRow(){
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

    public int[][] getField(){
        return area;
    }
}
