package Chess;

public interface Castlingable {
    default String castling(King king, Rook rook){
        return king.getName() + " � " + rook.getName() + " ��������� ���������";
    }
}
