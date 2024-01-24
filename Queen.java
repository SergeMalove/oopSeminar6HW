package Chess;

public class Queen extends Figure{
    public static String name = "Королева";

    public Queen() {
        super(name);
    }

    @Override
    public String move() {
        return name + " ходит в любом направлении";
    }
}
