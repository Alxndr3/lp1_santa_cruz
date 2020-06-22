package prova2;

import static game.tutor.PlayableGame.*;

public class Prova2_2 {

	public static void main(String[] args) {
		beginGame("prova2_fase2_100072120061");
		Moves.moveDown(1);
		Moves.moveLeft(2);
		Moves.moveUp(1);
		// Instanciar objeto da classe WarpEntry().
		WarpEntry we = new WarpEntry();
		we.name = "A";
		we.x = 9;
		we.y = 14;
		// Adicionar o objeto na posição xy
		player.addObject(we);
		Moves.moveUp(2);
		Moves.moveRight(2);
		Moves.moveDown(1);
		Moves.moveRight(2);
		Moves.moveUp(3);
		Moves.moveLeft(2);
		Moves.moveUp(2);
		// Executar movimentos de acordo com a direção apresentada
		if(player.getDirectionBelow() == UP) {
			Moves.moveUp(2);
			Moves.moveRight(2);
		}
		else {
			Moves.moveRight(2);
			Moves.moveUp(2);
		}
		// Instanciar objeto da classe WarpExit
		WarpExit wx = new WarpExit();
		wx.name = "C";
		wx.x = 7;
		wx.y = 3;
		// Adicionar o objeto na posição xy
		player.addObject(wx);
		Moves.moveUp(6);
		Moves.moveLeft(2);
		// Executar movimentos de acordo com a direção apresentada
		if(player.getDirectionBelow() == LEFT) {
			Moves.moveLeft(2);
			Moves.moveDown(4);
			Moves.moveRight(2);
		}
		else {
			Moves.moveDown(2);
			Moves.moveLeft(2);
			Moves.moveDown(2);
			Moves.moveRight(2);
		}
		Moves.moveDown(8);
		Moves.moveRight(1);
		// Executar função com loop para determinado número de movimentos
		Moves.loop2(player.getNumberBelow());
		Moves.moveRight(1);
		Moves.moveUp(2);
		Moves.moveRight(2);
		Moves.moveDown(10);
		Moves.moveLeft(4);
		Moves.moveUp(6);
		Moves.moveRight(2);
		Moves.moveUp(2);
	}
}
