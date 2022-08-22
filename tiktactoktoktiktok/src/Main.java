import java.util.Scanner;

public class Main {
    private Game game;
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Mode:");
        System.out.println("1. Human vs Human");
        System.out.println("2. Human vs Computer");
        System.out.println("3. Computer vs Computer");
        int i = sc.nextInt();
        if(i == 1) {
            System.out.println("You've chosen Human vs Human");
            game = new Game(new ManualPlayer(), new ManualPlayer());
        }
        else if(i == 2){
            System.out.println("You've chosen Human vs Computer");
            game = new Game(new ManualPlayer(), new RobotPlayer());
        }
        else if(i == 3){
            System.out.println("You've chosen Computer vs Computer");
            game = new Game(new RobotPlayer(), new RobotPlayer());
        }
        else{
            System.out.println("Booooi, stop playing with me dawg");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        Main k = new Main();
        k.run();
    }
}
