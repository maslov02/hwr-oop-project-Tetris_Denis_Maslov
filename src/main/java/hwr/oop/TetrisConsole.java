package hwr.oop;

import java.io.Console;
import java.io.IOException;
import java.util.List;

public class TetrisConsole {

    TetrisConsole(){
        showGamefield();
    }

    public void showGamefield(){
        Rules rules = new Rules();
        rules.setBlockToOne(1,9);
        rules.setBlockToOne(3,8);
        rules.setBlockToOne(5,7);
        rules.setBlockToOne(7,6);
        rules.setBlockToOne(9,5);
        rules.setBlockToOne(11,4);
        rules.setBlockToOne(13,3);
        rules.setBlockToOne(15,2);
        rules.setBlockToOne(17,1);
        rules.setBlockToOne(19,0);
        int[][] matrix = rules.getField();
        //begin at top of the matrix and go down to Zero
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void refreshGamefield(){


    }
}
