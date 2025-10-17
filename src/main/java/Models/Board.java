package Models;

public class Board {
    PuzzleGenerator puzzleGenerator=new PuzzleGenerator();
    public int [][] board=puzzleGenerator.getPuzzle();;
    private boolean[][] fixed=puzzleGenerator.getBoolPuzzle();


    public Board(){

    }

    public boolean cellSGet(int x,int y){
        return fixed[x][y];
    }
    public int cellVGet(int x,int y){
        return board[x][y];
    }
    public void regenerateBoard(){
        puzzleGenerator.resetPuzzle();
        board = puzzleGenerator.getPuzzle();
        fixed = puzzleGenerator.getBoolPuzzle();

    }
    public void cellMod(int x, int y,int value){
        board[x][y]=value;
    }

}
