package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece{

	public Knight(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "N";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getRows()];
		
		// above left
		Position p = new Position(0, 0);
		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColumn(p.getColumn() - 2);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//left above
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 2);
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
 		
		
		// above right
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 2);
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// right above
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
			p.setRow(p.getRow() + 2);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// down left
		p.setValues(position.getRow() - 1, position.getColumn() + 2);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 2);
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// left down 
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
			p.setRow(p.getRow() - 2);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// down right
		p.setValues(position.getRow() + 1, position.getColumn() + 2);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
			p.setColumn(p.getColumn() + 2);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// right down
		p.setValues(position.getRow() + 2, position.getColumn() + 1);
		if (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 2);
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}

}
