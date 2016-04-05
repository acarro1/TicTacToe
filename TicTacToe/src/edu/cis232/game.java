package edu.cis232;
import edu.cis232.Board;
public class game {
	
	String currentPlayer = "O";
	boolean gameWon = true;
	boolean gameTie = true;
	String message;
	Board play = new Board();
	int i = 1;
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		do 
		{
			switchPlayer();
			makeMove(getCurrentPlayer());
		}
		while (gameWon && gameTie);
	}
	public void makeMove(String player){
		do{
		message = "Please enter your move player " + player;
		//get the input based on the image clicked
		//pass that input back here
		if (play.checkValid()){
			i = 2;
			play.setMove(player);
			if (play.checkWinner()){
			}
			else{
				message = "You have won player " + player;
			}
			if (play.checkTie()){
			}
			else{
				message = "the game is a draw";
			}
		}
		else{
			message = "Invalid Move. Choose more wisely";
		}
		}
		while (i == 1);
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

}
