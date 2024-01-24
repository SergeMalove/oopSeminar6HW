package Chess;

public class King extends Figure implements Castlingable{
    public static String name = " ороль";

    public King() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ходит на 1 клетку в любом направлении";
    }
}
