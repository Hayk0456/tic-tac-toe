import java.util.ArrayList;

public class Board {
    public ArrayList<Cell> gameBoard = new ArrayList<>();

    public void createBoard()
    {
        gameBoard.add(new Cell(0,0));
        gameBoard.add(new Cell(0,1));
        gameBoard.add(new Cell(0,2));

        gameBoard.add(new Cell(1,0));
        gameBoard.add(new Cell(1,1));
        gameBoard.add(new Cell(1,2));

        gameBoard.add(new Cell(2,0));
        gameBoard.add(new Cell(2,1));
        gameBoard.add(new Cell(2,2));

    }

}