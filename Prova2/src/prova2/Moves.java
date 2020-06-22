package prova2;

import static game.tutor.PlayableGame.*;

public class Moves {
	
	// Métodos para definir via um argumento o número desejado de movimentos.
	public static void moveDown(int x) {
		for(int i = 0; i < x; i++) {
			player.moveDown();
		   }
		}

	public static void moveUp(int x) {
		for(int i = 0; i < x; i++) {
			player.moveUp();
		   }
		}

	public static void moveLeft(int x) {
		for(int i = 0; i < x; i++) {
			player.moveLeft();
		   }
		}

	public static void moveRight(int x) {
		for(int i = 0; i < x; i++) {
			player.moveRight();
		   }
		}

	//  Método para realizar os movimentos de loop da faze1.
	public static void loop1(int l) {
		for(int i = 1; i < l; i++) {
			Moves.moveRight(3);
			Moves.moveDown(2);
			Moves.moveLeft(4);
			Moves.moveUp(2);
			Moves.moveRight(1);
		}
	}
	//  Método para realizar os movimentos de loop da faze2.
	public static void loop2(int l) {
		for(int i = 1; i < l; i++) {
			Moves.moveRight(1);
			Moves.moveUp(2);
			Moves.moveLeft(2);
			Moves.moveDown(2);
			Moves.moveRight(1);
		}
	}
}
