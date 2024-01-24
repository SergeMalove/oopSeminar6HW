package Chess;

public class Pawn extends Figure{
    public static String name = "Пешка";

    public Pawn() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ходит на 1 клетку только вперед";
    }
}
