package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

	public Pawn(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "P";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getRows()];
		
		// above
		int cont = 0;
		if (cont == 0) {
			Position p = new Position(0, 0);
			p.setValues(position.getRow() - 1, position.getColumn());
		 
			while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p) && cont < 2) {
				mat[p.getRow()][p.getColumn()] = true;
				p.setRow(p.getRow() - 1);
				
			}
		
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		else {
			Position p = new Position(0, 0);
			p.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
				p.setRow(p.getRow() - 1);
				
			}
			
			if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
				}
		}
 		
			return mat;
	}
}
