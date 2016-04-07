package edu.cis232;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.cis232.game;


public class MainController {
	game playing = new game();


    @FXML
    private ImageView Image00;

    @FXML
    private ImageView Image01;

    @FXML
    private ImageView Image02;

    @FXML
    private ImageView Image10;

    @FXML
    private ImageView Image11;

    @FXML
    private ImageView Image12;

    @FXML
    private ImageView Image20;

    @FXML
    private ImageView Image21;

    @FXML
    private ImageView Image22;

    @FXML
    private Label LabelDisplay;

    Image x = new Image (getClass().getResource("X.jpg").toString());
    Image o = new Image (getClass().getResource("O.jpg").toString());
    @FXML
    void Image00() {
    	MoveResult tic = playing.makeMove(0, 0);
    	if (tic == MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image00.setImage(x);
    		}
    		if (active == "O"){
    			Image00.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image01() {
    	MoveResult tic = playing.makeMove(0, 1);
    	if (tic == MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image01.setImage(x);
    		}
    		if (active == "O"){
    			Image01.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image02() {
    	MoveResult tic = playing.makeMove(0, 2);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image02.setImage(x);
    		}
    		if (active == "O"){
    			Image02.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image10() {
    	MoveResult tic = playing.makeMove(1, 0);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image10.setImage(x);
    		}
    		if (active == "O"){
    			Image10.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image11() {
    	MoveResult tic = playing.makeMove(1, 1);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image11.setImage(x);
    		}
    		if (active == "O"){
    			Image11.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image12() {
    	MoveResult tic = playing.makeMove(1, 2);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image12.setImage(x);
    		}
    		if (active == "O"){
    			Image12.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image20() {
    	MoveResult tic = playing.makeMove(2, 0);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image20.setImage(x);
    		}
    		if (active == "O"){
    			Image20.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image21() {
    	MoveResult tic = playing.makeMove(2, 1);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image21.setImage(x);
    		}
    		if (active == "O"){
    			Image21.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

    @FXML
    void Image22() {
    	MoveResult tic = playing.makeMove(2, 2);
    	if (tic != MoveResult.InvalidMove){
    		String active = playing.getCurrentPlayer();
    		if (active == "X"){
    			Image22.setImage(x);
    		}
    		if (active == "O"){
    			Image22.setImage(o);
    		} 
        	playing.switchPlayer();
        	LabelDisplay.setText("It is your turn player" + playing.getCurrentPlayer());
    	}
    	else{
    		LabelDisplay.setText("That is an invalid move");
    	}
    }

}