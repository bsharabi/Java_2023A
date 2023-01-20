package Assignment;

import java.util.Scanner;

public class Game {

    int totalNumberOfMatches;
    int maximumNumberOfMatches;
    String winner;

    public Game(int totalNumberOfMatches, int maximumNumberOfMatches) {
        this.totalNumberOfMatches = totalNumberOfMatches;
        this.maximumNumberOfMatches = maximumNumberOfMatches;
        winner="";
    }

    public void Start(){

    }

}
class MGame {

    Game[] arrGame;
    int numberOfGame;

    public MGame(int numberOfGame) {
        this.arrGame = new Game[numberOfGame];
        this.numberOfGame=numberOfGame;
        init();
    }

    private void init() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numberOfGame; i++) {
            int totalNumberOfMatches = sc.nextInt();
            int maximumNumberOfMatches = sc.nextInt();
            arrGame[i]=new Game(totalNumberOfMatches,maximumNumberOfMatches);
            arrGame[i].Start();
        }

    }
}
