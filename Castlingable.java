package Chess;

public interface Castlingable {
    default String castling(King king, Rook rook){
        return king.getName() + " и " + rook.getName() + " совершили рокировку";
    }
}
