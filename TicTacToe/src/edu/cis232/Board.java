package edu.cis232;

public class Board {
	String[][] gameboard = new String[3][3];
	int counter = 0;
	public boolean checkValid(int a, int b){
		if(gameboard[a][b] == "null"){
		return true;
		}
		return false;
	}
	public void setMove(int a, int b, String active){
		gameboard[a][b] = active;
	}
	public String checkWin(){
		String winner = null;
		//Check rows
		winner = checkRowWinner();
		//Check columns
		if(winner == null){
			winner = checkColWinner();
		}
		
		if(winner == null){
			winner = checkDiagonalWinner();
		}
		
		return winner;
	}

	private String checkRowWinner() {
		String winner = null;
		for(int row = 0; row < gameboard.length; row++){
			boolean hasNull = false;
			for(int col = 0; col < gameboard[row].length; col++){
				//Check if there is a null first
				if(gameboard[row][col] == null){
					hasNull = true;
				}
			}
			
			boolean hasDifferent = false;
			String player = gameboard[row][0];
			if(!hasNull){
				//Check if winner
				for(int col = 1; col < gameboard[row].length; col++){
					if(!player.equals(gameboard[row][col])){
						hasDifferent = true;
					}
				}
			}
			
			if(!hasNull && !hasDifferent){
				winner = player;
			}
		}
		
		return winner;
	}
	
	private String checkColWinner() {
		String winner = null;
		
		for(int col = 0; col < gameboard[0].length; col++){
			boolean hasNull = false;
			for(int row = 0; row < gameboard.length; row++){
				//Check if there is a null first
				if(gameboard[row][col] == null){
					hasNull = true;
				}
			}
			
			boolean hasDifferent = false;
			String player = gameboard[0][col];
			if(!hasNull){
				//Check if winner
				for(int row = 1; col < gameboard.length; row++){
					if(!player.equals(gameboard[row][col])){
						hasDifferent = true;
					}
				}
			}
			
			if(!hasNull && !hasDifferent){
				winner = player;
			}
		}
		
		return winner;
	}
	
	private String checkDiagonalWinner(){
		//Check top-left to bottom-right
		if(gameboard[0][0] != null && gameboard[1][1] != null && gameboard[2][2] != null){
			if(gameboard[0][0].equals(gameboard[1][1]) && gameboard[1][1].equals(gameboard[2][2])){
				return gameboard[0][0];
			}
		}
		
		//Check bottom-left to top-right
		if(gameboard[2][0] != null && gameboard[1][1] != null && gameboard[0][2] != null){
			if(gameboard[2][0].equals(gameboard[1][1]) && gameboard[1][1].equals(gameboard[0][2])){
				return gameboard[1][1];
			}
		}
		
		return null;
	}

	public boolean checkTie(){
		counter++;
		if (counter == 9){
			return true;
		}
		return false;
		
	}
}
