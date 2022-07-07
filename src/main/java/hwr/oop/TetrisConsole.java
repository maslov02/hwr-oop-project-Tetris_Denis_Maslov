package hwr.oop;

import java.util.Timer;
import java.util.TimerTask;

public class TetrisConsole {

    private Rules rules;

    TetrisConsole(){
        rules = new Rules();
        Timer();
    }

    //Code angepasst von https://www.baeldung.com/java-timer-and-timertask

    public void Timer(){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new RepeatedTask(),500,1000);
    }

    class RepeatedTask extends TimerTask {
        public void run() {
            System.out.println("----------");
            showGamefield();
            rules.Tick();
        }
    }

    //bis hier von https://www.baeldung.com/java-timer-and-timertask

    public void showGamefield(){
        int[][] matrix = rules.getField();
        //begin at top of the matrix and go down to Zero
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
