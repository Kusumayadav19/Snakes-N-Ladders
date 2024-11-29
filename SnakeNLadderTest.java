import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class SnakeNLadder{
    /*  Constant WINPOINT with value 100 each player will start their journey from 0, 
    roll Dice and try to win the race by reaching first at WINPOINT */

    final static int WINPOINT = 100;
    
    static Map< Integer, Integer > snake = new HashMap<Integer, Integer>();
    static Map<Integer, Integer > ladder = new HashMap<Integer, Integer>();

    {
        snake.put(99,54);
        snake.put(70, 55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95, 72);

        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
    }

    // Method Used to generate a random number between 1 to 6 
    public int rollDice(){
        int n = 0;
        Random r = new Random();
        n = r.nextInt(7);
        return (n == 0? 1 : n);
    }

    // Method calculates the position of the player based on their position and generated dice value.
    public int calculatePlayerValue(int player, int diceValue){
        player = player + diceValue;

        if(player > WINPOINT){
            player = player - diceValue;
            return player;
        }

        if(null != snake.get(player)){
            System.out.println("Swallowed by snake!!");
            player = snake.get(player);
        }

        if(null != ladder.get(player)){
            System.out.println("Climb up the ladder");
            player = ladder.get(player);
        }

        return player;
    }

    // Methos returns true if the player value reaches to WINPOINT
    public boolean isWin(int player){
        return WINPOINT == player;
    }

    public void startGame(){
        int playerOne = 0, playerTwo = 0;
        int currentPlayer = -1;
        Scanner s = new Scanner(System.in);
        String str;
        int diceValue = 0;

        try{ 
            do{
                System.out.println(currentPlayer == -1?"\n\n FIRST PLAYER TURN":"\n\n SECOND PLAYER TURN ");
                System.out.println("Press r to roll Dice");
                str = s.next();
                diceValue = rollDice();

            if(currentPlayer == -1){
                playerOne = calculatePlayerValue(playerOne, diceValue);
                System.out.println("First Player : " + playerOne);
                System.out.println("Second Player : " + playerTwo);
                System.out.println("----------------------------------------------");
                if(!isWin(playerOne)){
                    System.out.println("First Player Won the Match!!");
                    return;
                }
            }else{
                playerTwo = calculatePlayerValue(playerTwo, diceValue);
                System.out.println("First Player : " + playerOne);
                System.out.println("Second Player : " + playerTwo);
                System.out.println("-----------------------------------------------");
                if(!isWin(playerTwo)){
                    System.out.println("Second Player Won the Match!!");
                    return;
                }
            }

            currentPlayer = -currentPlayer;


        }while("r".equals(str));
    }finally{
        s.close();
        }
    }
}
public class SnakeNLadderTest{
    public static void main(String[] args) {
        SnakeNLadder s = new SnakeNLadder();
        s.startGame();
    }
}