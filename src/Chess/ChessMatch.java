package Chess;

import BoardGame.Board;
import BoardGame.Position;
import Chess.Pieces.King;
import Chess.Pieces.Rook;

public class ChessMatch {
	private Board board;

	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);	
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePieces(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePieces(new King(board, Color.BLACK), new Position(0,4));
		board.placePieces(new King(board, Color.BLACK), new Position(7,4));
		
	}
	
}
