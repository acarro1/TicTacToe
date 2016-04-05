package edu.cis232;

public class Board {
	String[][] gameboard = new String[3][3];
	public boolean checkValid(){
		//if the space isn't taken
		return true;
		//else return false;
	}
	public void setMove(int a, int b, String active){
		gameboard[a][b] = active;
	}
	public boolean checkWinner(){
		//if the game isn't won
		return false;
		//else return true;
	}
	public boolean checkTie(){
		//if the game isn't over
		return false;
		//else return true;
	}
}
