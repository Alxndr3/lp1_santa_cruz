package prova2;

import static game.tutor.PlayableGame.*;

public class Prova2_1 {

	public static void main(String[] args) {
		beginGame("prova2_fase1_100072120061");
		Moves.moveDown(2);
		Moves.moveLeft(2);
		Moves.moveUp(2);
		Moves.moveRight(2);
		Moves.moveUp(2);
		if(player.getDirectionBelow() == LEFT) {
			Moves.moveLeft(2);
			Moves.moveUp(4);
			Moves.moveRight(5);
			Moves.loop1(player.getNumberBelow());
		}
		else {
			Moves.moveUp(4);
			Moves.moveRight(3);
			Moves.loop1(player.getNumberBelow());
		}
		Moves.moveRight(3);
		Moves.moveDown(2);
		Moves.moveLeft(4);
		Moves.moveDown(2);
		Moves.moveRight(4);
		Moves.moveDown(6);
		Moves.moveLeft(2);
		Moves.moveUp(4);
		Moves.moveLeft(2);
		Moves.moveDown(4);
		allowHumanControl();
	}
}
