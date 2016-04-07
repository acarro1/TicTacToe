package edu.cis232;
import edu.cis232.Board;
public class game {
	
	String currentPlayer = "O";
	boolean gameWon = true;
	boolean gameTie = true;
	Board play = new Board();
	
	
	public MoveResult makeMove(int row, int col){
		if(!play.checkValid(row, col)){
			return MoveResult.InvalidMove;
		}
		play.setMove(row, col, currentPlayer);
		if(play.checkWin() != null){
			return MoveResult.PlayerWon;
		}
		if(play.checkTie()){
			return MoveResult.TieGame;
		}
		return MoveResult.ValidMove;
		
	}
	
	public void switchPlayer(){
		if (currentPlayer == "X"){
			currentPlayer = "O";
		}
		else if (currentPlayer == "O"){
			currentPlayer = "X";
		}
	}
	
	public String getCurrentPlayer(){
		return currentPlayer;
	}
	public void newGame(){
		play.eraseBoard();
		
	}

}
