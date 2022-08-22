public class Game {
    Player player1;
    Player player2;


    public Game(ManualPlayer p1, RobotPlayer p2) {
        player1 = p1;
        player2 = p2;
    }
    public Game(RobotPlayer p1, RobotPlayer p2) {
        player1 = p1;
        player2 = p2;
    }
    public Game(ManualPlayer p1, ManualPlayer p2) {
        player1 = p1;
        player2 = p2;
    }
}
